package com.cloud.cosumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyTicketService
{
    @Autowired
    TicketService ticketService;

    public String buy(String name){
        return name+"买到了"+ticketService.getTicket();
    }


    public String error(String message){
        return "你的消息："+message+"/"+"请求失败";
    }
}
