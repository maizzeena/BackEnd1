package k24.MEka.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

import hh.CarDatabaseWeek2.model.Car;


@Controller
public class MyController  {
	
	@GetMapping("hello")
	public String showMessage(@RequestParam String name, @RequestParam int age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "hello";
	}
	
	@GetMapping("hello1")
	public String showMessage(@RequestParam String firstName, @RequestParam String lastName, Model model) {
		model.addAttribute("name", firstName);
		model.addAttribute("name", lastName);
		
		return "hello1";
	}
	
	@GetMapping("/studentlist")
	public String showStudents(Model model) {
		System.out.println("students...");
		
		//Meillä ei ole tietokantaa, joten kovakoodataan autot
		List<Student> students = new ArrayList<>();
		students.add(new Student("Kate Cole"));
		students.add(new Student("Dan Brown"));
		students.add(new Student("Mike Mars"));
	
	/*@RequestMapping("index")
	@ResponseBody
	public String returnIndex() {
		return "This is the index page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String returnContact() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String returnHello (@RequestParam (name="location", required=false) String location, 
			@RequestParam (name="name", required=false) String name) {
		return "Welcome to the " + location + " " + name + "!";
	}*/
}

