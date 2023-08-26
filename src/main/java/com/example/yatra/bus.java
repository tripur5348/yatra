package com.example.yatra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.service.annotation.GetExchange;

public class bus {
   @GetExchange("/mybus")
    public String getData(){
       return "please book your yicket, AALIYA EXPRESS LINIES";

    }
}
