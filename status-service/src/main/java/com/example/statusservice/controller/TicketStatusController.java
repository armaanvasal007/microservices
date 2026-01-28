package com.example.statusservice.controller;

import com.example.statusservice.model.TicketStatus;
import com.example.statusservice.service.TicketStatusService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/status")
public class TicketStatusController {

    private final TicketStatusService service;

    public TicketStatusController(TicketStatusService service) {
        this.service = service;
    }

    // POST /status/update
    @PostMapping("/update")
    public ResponseEntity<TicketStatus> updateStatus(@RequestBody TicketStatus status) {
        return ResponseEntity.ok(service.updateStatus(status));
    }

    // GET /status/{ticketId}
    @GetMapping("/{ticketId}")
    public ResponseEntity<TicketStatus> getStatus(@PathVariable Long ticketId) {
        return service.getCurrentStatus(ticketId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET /status/summary/{date}
    @GetMapping("/summary/{date}")
    public Map<String, Long> summary(@PathVariable String date) {
        return service.getDailySummary(LocalDate.parse(date));
    }
}
