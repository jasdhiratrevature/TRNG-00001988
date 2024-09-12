package com.revature.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public Optional<Employee> findByName(String name);
}
