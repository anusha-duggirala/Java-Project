package com.codeToDo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTo {

	@ResponseBody
	@GetMapping("/home")
    public String getInfo() {
	return "This is Java Project";
    }
}
