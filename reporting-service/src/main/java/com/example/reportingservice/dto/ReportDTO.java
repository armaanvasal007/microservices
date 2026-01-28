package com.example.reportingservice.dto;

public class ReportDTO {

    private TicketDTO ticket;
    private StatusDTO status;

    public TicketDTO getTicket() { return ticket; }
    public void setTicket(TicketDTO ticket) { this.ticket = ticket; }

    public StatusDTO getStatus() { return status; }
    public void setStatus(StatusDTO status) { this.status = status; }
}
