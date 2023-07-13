package br.com.o8k.academy.exercsspringb.controller;

import br.com.o8k.academy.exercsspringb.model.CrewMember;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crew-members")
public class CrewMemberController {
    @GetMapping
    public CrewMember crewMember(){
        return new CrewMember("Thanos", 30);
    }
}
