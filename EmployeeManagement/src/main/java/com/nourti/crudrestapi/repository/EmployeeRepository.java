package com.nourti.crudrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nourti.crudrestapi.entity.Employee;

@Repository
public interface  EmployeeRepository extends JpaRepository<Employee, Long> {

}
