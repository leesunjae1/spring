package com.my.attendance.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AdminUser {
	private String employeeName;
	private int employeePhone;
	private String employeePosition;
	private String employeeAddress;
	private String employeeEmail;
	private LocalDate hireDate;
}
