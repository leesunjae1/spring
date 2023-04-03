package com.my.attendance.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Employee {
	private int employee_No;
	private String employee_Name;
	private int employee_Pino;
	private String employee_Id;
	private String employee_Email;
	private int employee_Ph;
	private String employee_Addr;
	private LocalDate hireDate;
	private String profileFilename;
	private String employee_Position;
}
