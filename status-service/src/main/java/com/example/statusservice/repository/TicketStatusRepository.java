package com.example.statusservice.repository;

import com.example.statusservice.model.TicketStatus;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TicketStatusRepository {

    TicketStatus save(TicketStatus status);

    Optional<TicketStatus> findLatestByTicketId(Long ticketId);

    List<TicketStatus> findByDate(LocalDate date);
}
