package com.JenkinsDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class jenkins {

	@GetMapping("/jenkins")
	public String jenkins()
	{
		return "jenkins";
	}
	
}
