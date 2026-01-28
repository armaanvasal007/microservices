package com.example.ticketservice.controller;

import com.example.ticketservice.model.Ticket;
import com.example.ticketservice.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    // POST /tickets/create
    @PostMapping("/create")
    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {
        Ticket created = ticketService.createTicket(ticket);
        return ResponseEntity.ok(created);
    }

    // GET /tickets/{ticketId}
    @GetMapping("/{ticketId}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable Long ticketId) {
        return ticketService.getTicketById(ticketId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET /tickets/employee/{employeeId}
    @GetMapping("/employee/{employeeId}")
    public List<Ticket> getTicketsByEmployee(@PathVariable String employeeId) {
        return ticketService.getTicketsByEmployee(employeeId);
    }

    // GET /tickets/priority/{priority}
    @GetMapping("/priority/{priority}")
    public List<Ticket> getTicketsByPriority(@PathVariable String priority) {
        return ticketService.getTicketsByPriority(priority);
    }
}
