package com.my.attendance.domain;

import java.time.LocalDate;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class EmployeeDto {
	private int employee_No;
	private String employee_Name;
	private int employee_Pino;
	private String employee_Id;
	private String employee_Email;
	private int employee_Ph;
	private String employee_Addr;
	private LocalDate hireDate;
	private MultipartFile profile;
	private String employee_Position;
}	
