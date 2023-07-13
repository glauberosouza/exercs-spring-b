package br.com.o8k.academy.exercsspringb.controller;

import br.com.o8k.academy.exercsspringb.controller.request.PostStudentRequest;
import br.com.o8k.academy.exercsspringb.model.entity.Student;
import br.com.o8k.academy.exercsspringb.model.repository.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student saveStudent(@Valid @RequestBody PostStudentRequest request) {
        var student = new Student();
        BeanUtils.copyProperties(request, student);
        repository.save(student);
        return student;
    }
}
