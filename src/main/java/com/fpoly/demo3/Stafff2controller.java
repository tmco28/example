package com.fpoly.demo3;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class Stafff2controller {
	@GetMapping("staff/index")
	public String index(Model model) {
		Staff2 staff2 = new Staff2();
		staff2.setPosition("EMP");
		staff2.setHobbies(new String[] {"Travelling"});
		model.addAttribute("staff2", staff2);
		return "formStaff2";
		
	}
	
	@PostMapping("/staff2/save")
	public String save(@ModelAttribute("staff2") Staff2 staff2) {
		return "formStaff2";
	}
	
	@ModelAttribute("hobbies")
	public String[] getHobbies() {
		String[] hobbies= {"travelling", "Music", "Reading"};
		return hobbies;
	}
	
	@ModelAtriibute("postion")
	public Map<String,String> getPostion(){
		
	}

}
