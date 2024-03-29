package com.my.attendance.service;

import java.util.List;

import com.my.attendance.domain.Employee;

public interface EmployeeService {
	List<Employee> getEmployees();
	Employee getEmployee(int employeeNo);
	void addEmployee(Employee employee);
	void fixEmployee(Employee employee);
	void delEmployee(int employeeNo);
}
