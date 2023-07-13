package br.com.o8k.academy.exercsspringb.controller.request;

import jakarta.validation.constraints.NotBlank;

public class PostStudentRequest {
    @NotBlank(message = "Nome obrigatório!")
     private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
