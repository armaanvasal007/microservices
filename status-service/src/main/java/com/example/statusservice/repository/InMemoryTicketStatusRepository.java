package com.example.statusservice.repository;

import com.example.statusservice.model.TicketStatus;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Repository
public class InMemoryTicketStatusRepository implements TicketStatusRepository {

    private final Map<Long, List<TicketStatus>> statusStore = new HashMap<>();

    @Override
    public TicketStatus save(TicketStatus status) {
        statusStore.computeIfAbsent(status.getTicketId(), k -> new ArrayList<>())
                .add(status);
        return status;
    }

    @Override
    public Optional<TicketStatus> findLatestByTicketId(Long ticketId) {
        List<TicketStatus> list = statusStore.get(ticketId);
        if (list == null || list.isEmpty()) return Optional.empty();
        return Optional.of(list.get(list.size() - 1));
    }

    @Override
    public List<TicketStatus> findByDate(LocalDate date) {
        List<TicketStatus> result = new ArrayList<>();

        for (List<TicketStatus> statuses : statusStore.values()) {
            for (TicketStatus s : statuses) {
                if (s.getUpdatedAt().toLocalDate().equals(date)) {
                    result.add(s);
                }
            }
        }
        return result;
    }
}
