package com.example.reportingservice.controller;

import com.example.reportingservice.dto.ReportDTO;
import com.example.reportingservice.service.ReportingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/report")
public class ReportingController {

    private final ReportingService reportingService;

    public ReportingController(ReportingService reportingService) {
        this.reportingService = reportingService;
    }

    @GetMapping("/{ticketId}")
    public ReportDTO getFullReport(@PathVariable Long ticketId) {
        return reportingService.getReportByTicketId(ticketId);
    }
}
