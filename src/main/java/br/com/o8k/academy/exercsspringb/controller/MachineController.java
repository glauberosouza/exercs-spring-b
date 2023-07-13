package br.com.o8k.academy.exercsspringb.controller;

import br.com.o8k.academy.exercsspringb.model.Machine;
import br.com.o8k.academy.exercsspringb.model.PostMachineRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/machines")
public class MachineController {
    private final List<Machine> machines = new ArrayList<>();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String saveMachine(@RequestBody PostMachineRequest postMachineRequest) {
        var machine =
                new Machine(UUID.randomUUID().toString(), postMachineRequest.getName(), postMachineRequest.getModel());
        machines.add(machine);
        return machine.getId();
    }

    // e62ea631-7159-49a5-916d-8d2783b8788d
    // 9568e4a7-5a58-40cf-8797-93ae262da366
    @GetMapping("/{id}")
    public Machine machine(@PathVariable String id) {
        return machines.stream().filter(machine -> machine.getId().equals(id))
                .findFirst().orElseThrow(RuntimeException::new);
    }

    @GetMapping
    public Machine machineByParam(@RequestParam(name = "id") String id) {
        return machines.stream().filter(machine -> machine.getId().equals(id))
                .findFirst().orElseThrow(RuntimeException::new);
    }
}