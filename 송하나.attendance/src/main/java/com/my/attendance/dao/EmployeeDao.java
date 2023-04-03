package com.my.attendance.dao;

import com.my.attendance.domain.Employee;

public interface EmployeeDao {
	Employee loginCheck(String empId, String empPw);
}
