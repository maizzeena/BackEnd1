package k24.MEka.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController  {
	
	@RequestMapping("index")
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
	}
}

