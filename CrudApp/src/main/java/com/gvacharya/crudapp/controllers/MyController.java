package com.gvacharya.crudapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gvacharya.crudapp.entities.Employee;
import com.gvacharya.crudapp.service.EmpService;

import java.util.List;


@Controller
public class MyController {

	@Autowired
	private EmpService empService;

	@GetMapping("/index")
	public String home() {
		return "index";
	}

	@GetMapping("/addEmployee")
	public String addEmployee() {
		return "addEmployee";
	}

	@PostMapping("/saveEmployee")
	public void saveEmployee(HttpServletRequest req, HttpServletResponse resp,
			@ModelAttribute("employee") Employee employee, Model model) throws ServletException, IOException {

		if (empService.addEmployee(employee).equals("Employee Added Successfully")) {
			resp.sendRedirect(req.getContextPath() + "/savedEmployee");
		} else {
			resp.sendRedirect(req.getContextPath() + "/addEmployee?error=Failed to add Employee.");
		}
	}

	@GetMapping("/searchEmployee")
	public String searchEmployee() {
		return "searchEmployee";
	}

	@PostMapping("/searchEmployee")
	public void foundEmployee(HttpServletRequest req, Model model) {

		String empId = req.getParameter("empId");
		try {
			Employee employee = empService.getEmployeeById(empId);
			if (employee != null) {
				model.addAttribute("employee", employee);
			} else {
				model.addAttribute("message", "Employee Not Found!");
			}
		} catch (Exception e) {
			model.addAttribute("message", "Employee ID format not valid!");
		}
	}

	@RequestMapping("/savedEmployee")
	public String savedEmployee() {
		return "savedEmployee";
	}

	@GetMapping("/updateEmployee")
	public String updateEmployee() {
		return "updateEmployee";
	}

	@PostMapping("/updateEmployee")
	public String verifyEmployee(HttpServletRequest req, Model model) {

		String empId = req.getParameter("empId");
		try {
			Employee employee = empService.getEmployeeById(empId);
			if (employee != null) {
				model.addAttribute("empFound", true);
				model.addAttribute("employee", employee);
				model.addAttribute("empF", "Employee Found!");
			} else {
				model.addAttribute("message", "Employee Not Found!");
			}
		} catch (Exception e) {
			model.addAttribute("message", "An error occurred while fetching employee details.");
		}
		return "updateEmployee";
	}

	@PostMapping("/saveUpdatedEmployeeInfo")
	public String updateEmployee(@ModelAttribute("employee") Employee employee, Model model) {

		try {
			String updateMessage = empService.updateEmployee(employee);
			if (updateMessage.equals("Employee Information Updated Successfully!")) {
				model.addAttribute("message", updateMessage);
				return "redirect:/savedEmployee";
			} else {
				model.addAttribute("message", "Failed to update Employee.");
			}
		} catch (Exception e) {
			model.addAttribute("message", "An error occurred while updating employee details.");
		}
		return "updateEmployee";
	}

	@GetMapping("/deleteEmployee")
	public String deleteEmployee() {
		return "deleteEmployee";
	}
	
	@PostMapping("/deleteEmployee")
	public String deleteEmployeeData(HttpServletRequest req,Model model) {
		
		try {
			String empId = req.getParameter("empId");
			String result = empService.deleteEmployee(empId);
			System.out.println(result);
			if("Employee Deleted Successfully!".equals(result)) {
				model.addAttribute("successfulMessage", "Employee Removed!");
			}else {
				model.addAttribute("unsuccessfulMessage", "Employee Not Found!");
			}
		} catch (Exception e) {
			model.addAttribute("errorMessage","Error Occured, Please Try Again!");
		}
		return "deleteEmployee";
	}
	
	@GetMapping("/employees")
	public String employeesList() {
		List<Employee> employeeList = empService.employeesList();
		System.out.println(employeeList);
		return "employees";
	}
	
}
