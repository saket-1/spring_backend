package com.practice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    
}
