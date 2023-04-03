package com.my.attendance.service;

import com.my.attendance.domain.Employee;

public interface EmployeeService {
	Employee loginCheck(String empId, String empPw);
}
