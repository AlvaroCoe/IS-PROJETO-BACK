package com.example.helpdesk.controller;

import org.springframework.web.bind.annotation.GetMapping;
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

        @GetMapping ("/marketing")
        public String marketing(){
            return "Bem-vindo ao Marketing";
        }

        @GetMapping ("/auditoria")
        public String auditoria (){
            return "Bem-vindo ao setor de Auditoria";
        }
    }




