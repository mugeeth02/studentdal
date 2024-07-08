package com.mugeeth.student.dal.repos;

import com.mugeeth.student.dal.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long>{
}
