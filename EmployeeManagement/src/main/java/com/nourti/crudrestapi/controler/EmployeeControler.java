package com.nourti.crudrestapi.controler;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nourti.crudrestapi.entity.Employee;
import com.nourti.crudrestapi.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*") 
@RequestMapping("/Employeemanagement")
public class EmployeeControler {

	
	private EmployeeService employeeService;

	public EmployeeControler(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAll();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable long id) {
  
		return employeeService.getById(id);
	}

	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee employee) throws Exception {
		return employeeService.create(employee);

	}

	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails) {
		return employeeService.update(employeeDetails, id);
	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable Long id) {

		employeeService.delet(id);
	}

}
