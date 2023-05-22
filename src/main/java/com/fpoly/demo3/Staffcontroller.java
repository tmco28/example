package com.fpoly.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Staffcontroller {
	@GetMapping("/staff")
	public String staff(Model model) {
		Staff staff = new Staff();
		staff.setId("No.1");
		staff.setFullName("Nguyễn Văn Tèo");
		staff.setPosition("MAN");	
		staff.setEmail("123@gmail.com");
		staff.setSalary(1000000.0);
		model.addAttribute("staff", staff);
		return "formDemo3";
	}
	@PostMapping("/staff/save")
	public String save(@ModelAttribute("staff") Staff staff) {
		staff.setFullName(staff.getFullName().toUpperCase());
		return "formDemo3";
	}
}
