package br.com.o8k.academy.exercsspringb.controller;

import br.com.o8k.academy.exercsspringb.controller.request.PostStudentRequest;
import br.com.o8k.academy.exercsspringb.model.entity.Student;
import br.com.o8k.academy.exercsspringb.model.repository.StudentPaginatedRepository;
import br.com.o8k.academy.exercsspringb.model.repository.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentRepository repository;
    @Autowired
    private StudentPaginatedRepository paginatedRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student saveStudent(@Valid @RequestBody PostStudentRequest request) {
        var student = new Student();
        BeanUtils.copyProperties(request, student);
        repository.save(student);
        return student;
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Student> findStudentById(@PathVariable Long id) {
        var studentById = repository.findById(id);
        return studentById;
    }

    @GetMapping("/page/{number}")
    public Page<Student> allStudentPaginated(@PathVariable int number){
        PageRequest page = PageRequest.of(number, 2);
        return paginatedRepository.findAll(page);
    }

    @GetMapping("/search")
    public List<Student> allStudentsByName(@RequestParam String name){
       return repository.findByNameContainingIgnoreCase(name);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateStudent(@PathVariable Long id, @Valid @RequestBody PostStudentRequest studentRequest) {
        repository.findById(id).ifPresent(student -> {
            var studentToUpdate = Student.from(studentRequest);
            studentToUpdate.setId(student.getId());
            repository.save(studentToUpdate);
        });
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteStudentById(@PathVariable Long id){
       repository.deleteById(id);
    }
}