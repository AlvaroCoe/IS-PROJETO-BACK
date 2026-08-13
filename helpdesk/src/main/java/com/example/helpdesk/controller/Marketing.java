package com.example.helpdesk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Marketing {

    @GetMapping("/marketing")
    public String mensagem() {
        return "Bem-Vindo ao Marketing";
    }
}
