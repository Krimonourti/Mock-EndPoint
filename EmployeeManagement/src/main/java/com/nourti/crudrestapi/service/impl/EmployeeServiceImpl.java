package com.nourti.crudrestapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nourti.crudrestapi.entity.Employee;
import com.nourti.crudrestapi.repository.EmployeeRepository;
import com.nourti.crudrestapi.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger logger = LogManager.getLogger(EmployeeServiceImpl.class);

	private EmployeeRepository employeeRepository;

	//Injection D using Constructor
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee create(Employee t) {

		return employeeRepository.save(t);

	}

	@Override
	public Employee update(Employee employeeDetails, Long k) {

		Optional<Employee> employee = employeeRepository.findById(k);
		if (employee.isPresent()) {
			employee.get().setEmailID(employeeDetails.getEmailID());
			employee.get().setFirstName(employeeDetails.getFirstName());
			employee.get().setLastName(employeeDetails.getLastName());
		}

		return employeeRepository.save(employee.get());

	}

	@Override
	public void delet(Long k) {
		employeeRepository.deleteById(k);
	}

	@Override
	public Employee getById(Long k) {

		Optional<Employee> employee = employeeRepository.findById(k);

		if (employee.isPresent()) {
			return employee.get();
		}
		return null;
	}

	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

}
