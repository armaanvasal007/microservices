package com.example.reportingservice.dto;

public class StatusDTO {

    private Long ticketId;
    private String status;
    private String updatedBy;

    public Long getTicketId() { return ticketId; }
    public void setTicketId(Long ticketId) { this.ticketId = ticketId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getUpdatedBy() { return updatedBy; }
    public void setUpdatedBy(String updatedBy) { this.updatedBy = updatedBy; }
}
