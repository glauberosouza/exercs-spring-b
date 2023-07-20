package br.com.o8k.academy.exercsspringb.model.repository;

import br.com.o8k.academy.exercsspringb.model.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    @Override
    List<Student> findAll();

    List<Student> findByNameContainingIgnoreCase(String name);
}