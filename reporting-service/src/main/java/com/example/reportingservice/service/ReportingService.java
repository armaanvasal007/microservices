package com.example.reportingservice.service;

import com.example.reportingservice.client.StatusClient;
import com.example.reportingservice.client.TicketClient;
import com.example.reportingservice.dto.ReportDTO;
import com.example.reportingservice.dto.StatusDTO;
import com.example.reportingservice.dto.TicketDTO;
import org.springframework.stereotype.Service;

@Service
public class ReportingService {

    private final TicketClient ticketClient;
    private final StatusClient statusClient;

    public ReportingService(TicketClient ticketClient, StatusClient statusClient) {
        this.ticketClient = ticketClient;
        this.statusClient = statusClient;
    }

    public ReportDTO getReportByTicketId(Long ticketId) {

        TicketDTO ticket = ticketClient.getTicketById(ticketId);
        StatusDTO status = statusClient.getStatusByTicketId(ticketId);

        ReportDTO report = new ReportDTO();
        report.setTicket(ticket);
        report.setStatus(status);

        return report;
    }
}
