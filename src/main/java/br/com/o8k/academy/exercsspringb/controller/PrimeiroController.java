package br.com.o8k.academy.exercsspringb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/primeiro")
public class PrimeiroController {
    @GetMapping("/ola")
    public String olaMundo(){
        return "Olá mundo!";
    }
    @GetMapping("/que-dia-eh-hoje")
    public String queDiaEhHoje() {
        return "Hoje é: " + LocalDateTime.now();
    }
}