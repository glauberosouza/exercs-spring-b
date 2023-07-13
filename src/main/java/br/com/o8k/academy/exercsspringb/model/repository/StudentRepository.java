package br.com.o8k.academy.exercsspringb.model.repository;

import br.com.o8k.academy.exercsspringb.model.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
