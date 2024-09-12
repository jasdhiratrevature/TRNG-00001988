package com.revature.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public Optional<Employee> findByName(String name);
	@Query("from Employee e where salary > :salary")
	public List<Employee> findBySalary(double salary);
}
