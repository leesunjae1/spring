package com.my.attendance.domain;

import java.time.LocalDate;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class EmployeeDto {
	private int emp_No;
	private String emp_Name;
	private int emp_Pino;
	private String emp_Id;
	private String emp_Email;
	private int emp_Ph;
	private String emp_Addr;
	private LocalDate hireDate;
	private MultipartFile profile;
	private String emp_Position;
}	
