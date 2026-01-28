package com.example.statusservice.service;

import com.example.statusservice.model.TicketStatus;
import com.example.statusservice.repository.TicketStatusRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class TicketStatusService {

    private final TicketStatusRepository repository;

    public TicketStatusService(TicketStatusRepository repository) {
        this.repository = repository;
    }

    public TicketStatus updateStatus(TicketStatus status) {
        return repository.save(status);
    }

    public Optional<TicketStatus> getCurrentStatus(Long ticketId) {
        return repository.findLatestByTicketId(ticketId);
    }

    public Map<String, Long> getDailySummary(LocalDate date) {
        List<TicketStatus> list = repository.findByDate(date);

        Map<String, Long> summary = new HashMap<>();
        summary.put("Open", 0L);
        summary.put("In Progress", 0L);
        summary.put("Resolved", 0L);
        summary.put("Closed", 0L);

        for (TicketStatus s : list) {
            summary.put(s.getStatus(), summary.getOrDefault(s.getStatus(), 0L) + 1);
        }

        return summary;
    }
}
