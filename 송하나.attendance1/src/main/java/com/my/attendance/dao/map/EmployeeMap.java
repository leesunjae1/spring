package com.my.attendance.dao.map;

import java.util.List;
import com.my.attendance.domain.Employee;

public interface EmployeeMap {
	List<Employee> selectEmployees();
	Employee selectEmployee(int EmpNo);
	void insertEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(int EmpNo);
}


