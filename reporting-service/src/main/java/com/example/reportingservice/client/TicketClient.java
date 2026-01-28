package com.example.reportingservice.client;

import com.example.reportingservice.dto.TicketDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TicketClient {

    private final RestTemplate restTemplate = new RestTemplate();

    private final String TICKET_SERVICE_URL = "http://localhost:8080/tickets/";

    public TicketDTO getTicketById(Long ticketId) {
        return restTemplate.getForObject(TICKET_SERVICE_URL + ticketId, TicketDTO.class);
    }
}
