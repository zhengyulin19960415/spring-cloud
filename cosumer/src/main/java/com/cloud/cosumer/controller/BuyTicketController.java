package com.cloud.cosumer.controller;

import com.cloud.cosumer.service.BuyTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyTicketController
{
    @Autowired
    BuyTicketService buyTicketService;

    @RequestMapping(value = "/buy/{name}")
    public String buy(@PathVariable("name") String name){
        return buyTicketService.buy(name);
    }
}
