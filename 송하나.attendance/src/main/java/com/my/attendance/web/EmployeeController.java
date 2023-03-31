package com.my.attendance.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.my.attendance.domain.Employee;
import com.my.attendance.service.EmployeeService;

@RestController
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
	
	@GetMapping("get/{empNo}")
	public Employee getEmployee(@PathVariable int empNo) {
		return employeeService.getEmployee(empNo);
	}
	
	@PostMapping("add")
	public void addEmployee(Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("fix")
	public void fixEmployee(@RequestBody Employee employee) {
		employeeService.fixEmployee(employee);
	}
	
	@DeleteMapping("del/{empNo}")
	public void delEmployee(@PathVariable int empNo) {
		employeeService.delEmployee(empNo);
	}
}
