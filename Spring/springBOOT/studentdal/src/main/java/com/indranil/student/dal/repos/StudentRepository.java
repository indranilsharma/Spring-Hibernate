package com.indranil.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.indranil.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Long>{

}
