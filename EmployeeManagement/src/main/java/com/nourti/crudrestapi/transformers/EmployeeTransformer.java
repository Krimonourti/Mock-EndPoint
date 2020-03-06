package com.nourti.crudrestapi.transformers;

import com.nourti.crudrestapi.dto.EmployeeDTO;
import com.nourti.crudrestapi.entity.Employee;

public class EmployeeTransformer extends AbstractTransformer<EmployeeDTO, Employee> {

	@Override
	public EmployeeDTO toDTO(Employee entity) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setFirstName(entity.getFirstName());
		employeeDTO.setLastName(entity.getFirstName());
		employeeDTO.setEmailID(entity.getEmailID());
		employeeDTO.setId(entity.getId());
		return employeeDTO;
	}

	@Override
	public Employee toEntity(EmployeeDTO dto) {
		Employee employeeEntity = new Employee();
		employeeEntity.setFirstName(dto.getFirstName());
		employeeEntity.setLastName(dto.getLastName());
		employeeEntity.setEmailID(dto.getEmailID());
		employeeEntity.setId(dto.getId());
		return employeeEntity;
	}

}
