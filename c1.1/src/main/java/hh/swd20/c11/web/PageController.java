package hh.swd20.c11.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class PageController {
	
	//localhost:8080/index
	
	@RequestMapping("/index")
	public String getIndex() {
		return "This is the main page";
	}
	
	//localhost:8080/contact
	
	@RequestMapping("/contact")
	public String getContact() {
		return "This is the contact page";
	}

}
