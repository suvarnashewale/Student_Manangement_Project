package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentInfo;

@Controller
public class StudentHandler {

	@Autowired
	private StudentInfo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "Registration";
	}
	
	@RequestMapping("/addstudent")
	public String addstudent(@ModelAttribute Student student) {
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCity());
		System.out.println(student.getUseranme());
		System.out.println(student.getPassword());
		
		repo.save(student);
		
		return "Registration";
	}
}


