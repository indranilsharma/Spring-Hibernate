package com.indranil.studentdal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.indranil.student.dal.StudentdalApplication;
import com.indranil.student.dal.entities.Student;
import com.indranil.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudentdalApplication.class)
public class StudentdalApplicationTests {

	@Autowired
	StudentRepository studentRepository;

	@Test
	public void testStudentsSave() {

		Student student = new Student();
		student.setName("Jack1");
		student.setCourse("Big data1");
		student.setFee(5000);

		studentRepository.save(student);
	}

	@Test
	public void testStudentFindbyId() {
	
	 Student student = studentRepository.findById(2l).get();
	 System.out.println("STUDENT -------------------------- Log printing "+student);
	}
	
	
	@Test
	public void testUpdateStudent() {
	
	 Student student = studentRepository.findById(2l).get();
	 student.setName("Rohit");
	 
	 studentRepository.save(student);
	 
	}
	
	@Test
	public void testDeleteStudent() {
		studentRepository.deleteById(3l);
	}
}
