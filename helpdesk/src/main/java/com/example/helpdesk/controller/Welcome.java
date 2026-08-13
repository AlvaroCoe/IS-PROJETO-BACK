package com.example.helpdesk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Welcome {

        @GetMapping("/")
        public String mensagem() {
            return "Sejam bem-vindos";
        }

        @GetMapping("/dev")
        public String dev() {
            return "Atividades retornadas";
        }
    }




