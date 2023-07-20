package br.com.o8k.academy.exercsspringb.model.repository;

import br.com.o8k.academy.exercsspringb.model.entity.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentPaginatedRepository extends PagingAndSortingRepository<Student, Long> {

}
