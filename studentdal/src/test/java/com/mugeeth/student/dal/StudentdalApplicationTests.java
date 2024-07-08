package com.mugeeth.student.dal;

import com.mugeeth.student.dal.entities.Student;
import com.mugeeth.student.dal.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class StudentdalApplicationTests {
	@Autowired
	private StudentRepository repo;
	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setName("SAI");
		student.setCourse("Computer Science");
		student.setFee(50D);
		repo.save(student);
	}

	@Test
	void testFindStudentByID(){
		Student student = repo.findById(1L).get();
		System.out.println(student);
	}

	@Test
	void testUpdateStudent(){
		Student student = repo.findById(1L).get();
		student.setFee(60D);
		repo.save(student);
	}

	@Test
	void testDeleteStudent(){
		Student student = repo.findById(1L).get();
		repo.save(student);
	}
}
