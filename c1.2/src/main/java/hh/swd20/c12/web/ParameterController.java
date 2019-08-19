package hh.swd20.c12.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class ParameterController {
	
	//http://localhost:8080/hello?location=moon&name=Harri
	
		@RequestMapping("/hello")
		public String welcomeYou(@RequestParam(name="location") String paikka, 
				@RequestParam(name="name") String nimi) {
			return "Welcome to the " + paikka + " " + nimi + "!";
		}

}
