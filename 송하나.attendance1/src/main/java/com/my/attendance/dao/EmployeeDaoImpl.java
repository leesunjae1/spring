package com.my.attendance.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.attendance.dao.map.EmployeeMap;
import com.my.attendance.domain.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired private EmployeeMap employeeMap;
	
	@Override
	public List<Employee> selectEmployees() {
		return employeeMap.selectEmployees();
	}
	
	@Override
	public Employee selectEmployee(int employeeNo) {
		return employeeMap.selectEmployee(employeeNo);
	}
	
	@Override
	public void insertEmployee(Employee employee) {
		employeeMap.insertEmployee(employee);
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		employeeMap.updateEmployee(employee);
	}
	
	@Override
	public void deleteEmployee(int employeeNo) {
		employeeMap.deleteEmployee(employeeNo);
	}
}
