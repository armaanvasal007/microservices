package com.example.reportingservice.client;

import com.example.reportingservice.dto.StatusDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class StatusClient {

    private final RestTemplate restTemplate = new RestTemplate();

    private final String STATUS_SERVICE_URL = "http://localhost:8081/status/";

    public StatusDTO getStatusByTicketId(Long ticketId) {
        return restTemplate.getForObject(STATUS_SERVICE_URL + ticketId, StatusDTO.class);
    }
}
