//package com.example.ticketservice.repository;
//
//import com.example.ticketservice.model.Ticket;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface TicketRepository {
//
//    Ticket save(Ticket ticket);
//
//    Optional<Ticket> findById(Long id);
//
//    List<Ticket> findByEmployeeId(String employeeId);
//
//    List<Ticket> findByPriority(String priority);
//
//    List<Ticket> findAll();   // REQUIRED
//}









package com.example.ticketservice.repository;

import com.example.ticketservice.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findByEmployeeId(String employeeId);

    List<Ticket> findByPriority(String priority);
}
