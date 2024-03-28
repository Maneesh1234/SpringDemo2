package com.springdemo2.Demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springdemo2.Demo.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}
