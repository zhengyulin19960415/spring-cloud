package com.cloud.provider.controller;

import com.cloud.provider.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController
{
    @Autowired
    TicketService ticketService;

    @GetMapping(value = "/ticket")
    public String getTicket(){
        return ticketService.getTicket();
    }
}
