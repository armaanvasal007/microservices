package com.example.statusservice.model;

import java.time.LocalDateTime;

public class TicketStatus {

    private Long ticketId;
    private String status;        // Open, In Progress, Resolved, Closed
    private String updatedBy;     // IT Engineer name
    private LocalDateTime updatedAt;

    public TicketStatus() {
        this.updatedAt = LocalDateTime.now();
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
