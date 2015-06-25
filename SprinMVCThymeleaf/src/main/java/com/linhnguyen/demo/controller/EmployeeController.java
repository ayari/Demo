package com.linhnguyen.demo.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.linhnguyen.demo.model.DepartmentModel;
import com.linhnguyen.demo.model.EmloyeeModel;

@Controller
public class EmployeeController {

	@RequestMapping("/")
	public String home() {

		return "redirect:/results";

	}
	
	
	@RequestMapping("/results")
	public String getListEmployee(Model model) {

		DepartmentModel department = createTestData();
		
		model.addAttribute("department", department);
		
		return "results";

	}
	
	@RequestMapping("/resultsWithBootstrap")
	public String getListEmployeeWithBootstrap(Model model) {

		DepartmentModel department = createTestData();
		
		model.addAttribute("department", department);
		
		return "resultsWithBootstrap";

	}

	private DepartmentModel createTestData() {
		DepartmentModel departmentModel = new DepartmentModel();

		EmloyeeModel employee1 = new EmloyeeModel();
		employee1.setId("0001");
		employee1.setName("John Snow");
		employee1.setDesignation("Software Engineer");
		employee1.setSalary(new BigDecimal("7500000"));

		EmloyeeModel employee2 = new EmloyeeModel();
		employee2.setId("0002");
		employee2.setName("Peter Parker");
		employee2.setDesignation("Senior Software Engineer");
		employee2.setSalary(new BigDecimal("8500000"));

		EmloyeeModel employee3 = new EmloyeeModel();
		employee3.setId("0003");
		employee3.setName("Clark Kent");
		employee3.setDesignation("Consultant");
		employee3.setSalary(new BigDecimal("10500000"));

		EmloyeeModel employee4 = new EmloyeeModel();
		employee4.setId("0004");
		employee4.setName("Bruce Wayne");
		employee4.setDesignation("Senior Consultant");
		employee4.setSalary(new BigDecimal("17500000"));

		departmentModel.getEmloyeesList().add(employee1);
		departmentModel.getEmloyeesList().add(employee2);
		departmentModel.getEmloyeesList().add(employee3);
		departmentModel.getEmloyeesList().add(employee4);

		return departmentModel;
	}
}
