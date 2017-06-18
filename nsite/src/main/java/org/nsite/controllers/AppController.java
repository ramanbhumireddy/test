package org.nsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/")
    String home(ModelMap modal) {
        modal.addAttribute("title","CRUD Example");
        return "index";
    }
	
	
	@ExceptionHandler(Exception.class)
	public String errorHandler(Exception ex){
		return "error";
	}
	
}
