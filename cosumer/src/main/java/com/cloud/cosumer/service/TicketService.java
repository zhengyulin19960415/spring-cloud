package com.cloud.cosumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider",fallback = ErrorMessage.class)
public interface TicketService
{
    @GetMapping(value = "ticket")
    public String getTicket();
}
