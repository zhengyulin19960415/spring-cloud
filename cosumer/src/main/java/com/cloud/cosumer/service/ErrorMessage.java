package com.cloud.cosumer.service;

import org.springframework.stereotype.Component;

@Component
public class ErrorMessage implements  TicketService
{
    @Override
    public String getTicket()
    {
        return "你的请求失败!";
    }
}
