package com.my.attendance.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.attendance.domain.Employee;
import com.my.attendance.service.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
	@Autowired private EmployeeService employeeService;
	
	@GetMapping("emplist")
	public ModelAndView emplist(ModelAndView mv) {
		mv.setViewName("company/emp/emplist");
		return mv;	
	}
	
	@GetMapping("get")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	
	@GetMapping("get/{employeeNo}")
	public Employee getEmployee(@PathVariable int employeeNo) {
		return employeeService.getEmployee(employeeNo);
	}
	
	@PostMapping("add")
	public void addEmployee(Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("fix")
	public void fixEmployee(@RequestBody Employee employee) {
		employeeService.fixEmployee(employee);
	}
	
	@DeleteMapping("del/{employeeNo}")
	public void delEmployee(@PathVariable int employeeNo) {
		employeeService.delEmployee(employeeNo);
	}
}
