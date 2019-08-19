package hh.swd20.ekaspringprojektini.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class HelloController {
	
	// http://localhost:8080
	
	@RequestMapping("*")
	public String getHello() {
		return "Hello World!";
	}
	
	//http://localhost:8080/hello?firstname=Harri&lastname=Nupponen
	
	@RequestMapping("/hello")
	public String helloYou(@RequestParam(name="firstname") String etunimi, 
			@RequestParam(name="lastname") String sukunimi) {
		return "Hello " + etunimi + " " +sukunimi;
	}

}
