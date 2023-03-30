package com.my.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.my.attendance.dao.EmployeeDao;
import com.my.attendance.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	@Autowired private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getEmployees() {
		return employeeDao.selectEmployees();
	}
	
	@Override
	public Employee getEmployee(int empNo) {
		return employeeDao.selectEmployee(empNo);
	}
	
	@Override
	public void addEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}
	
	@Override
	public void fixEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}
	
	@Override
	public void delEmployee(int empNo) {
		employeeDao.deleteEmployee(empNo);
	}
}
