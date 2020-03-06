package sfgdi.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import sfgdi.sfgdi.services.GreetingService;

@Controller
public class MyController {
	
	@Autowired
	GreetingService greetingService;

	public String getMessage() {
		
		System.out.println(greetingService.sayGreeting());
		
		return "Hi Folks";
	}
}
