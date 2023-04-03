package com.my.attendance.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.my.attendance.domain.Employee;
import com.my.attendance.service.EmployeeService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeController {
	@RequestMapping("employee/login")
	@GetMapping
	public String login() {
		return "employee/login";
	}
	
	@Autowired private EmployeeService employeeService;
	
	@RequestMapping("employee/loginEmp")
	public String getEmployee(@RequestParam("empId") String empId, @RequestParam("empPw") String empPw, HttpSession session) {
		String result = "";
		Employee emp = employeeService.loginCheck(empId, empPw);
		if(emp != null) {
			session.setAttribute("empNo", emp.getEmpNo());
			session.setAttribute("empId", emp.getEmpId());
			session.setAttribute("empPw", emp.getEmpPw());
			session.setAttribute("empAddr", emp.getEmpAddr());
			session.setAttribute("empDetailAddr", emp.getEmpDetailAddr());
			session.setAttribute("empPostcode", emp.getEmpPostcode());
			session.setAttribute("empPh", emp.getEmpPh());
			session.setAttribute("empEmail", emp.getEmpEmail());
			session.setAttribute("hireDate", emp.getHireDate());
			session.setAttribute("empPosition", emp.getEmpPosition());
			session.setAttribute("empPino", emp.getEmpPino());
			session.setAttribute("profileName", emp.getProfileName());
			session.setAttribute("comId", emp.getComId());
			result = "main";
		} else {
			result = "";
		}
		return result;
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "main";
	}
}
