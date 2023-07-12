package br.com.o8k.academy.exercsspringb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiro")
public class PrimeiroController {
    @GetMapping
    public String olaMundo(){
        return "Olá mundo!";
    }
}
