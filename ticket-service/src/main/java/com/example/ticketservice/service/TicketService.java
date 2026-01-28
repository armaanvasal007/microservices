package com.example.ticketservice.service;

import com.example.ticketservice.model.Ticket;
import com.example.ticketservice.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
//public class TicketService {
//
//    private final TicketRepository ticketRepository;
//
//    public TicketService(TicketRepository ticketRepository) {
//        this.ticketRepository = ticketRepository;
//    }
//
//    public Ticket createTicket(Ticket ticket) {
//        return ticketRepository.save(ticket);
//    }
//
//    public Optional<Ticket> getTicketById(Long id) {
//        return ticketRepository.findById(id);
//    }
//
//    public List<Ticket> getTicketsByEmployee(String employeeId) {
//        return ticketRepository.findByEmployeeId(employeeId);
//    }
//
//    public List<Ticket> getTicketsByPriority(String priority) {
//        return ticketRepository.findByPriority(priority);
//    }
//}










@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Optional<Ticket> getTicketById(Long id) {
        return ticketRepository.findById(id);
    }

    public List<Ticket> getTicketsByEmployee(String employeeId) {
        return ticketRepository.findByEmployeeId(employeeId);
    }

    public List<Ticket> getTicketsByPriority(String priority) {
        return ticketRepository.findByPriority(priority);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
}
