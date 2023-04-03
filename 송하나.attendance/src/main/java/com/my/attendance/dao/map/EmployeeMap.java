package com.my.attendance.dao.map;

import com.my.attendance.domain.Employee;

public interface EmployeeMap {
	Employee selectLoginEmp(String empId, String empPw);
}
