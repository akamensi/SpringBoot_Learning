package com.aka.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articale")
public class ArticaleController {

	@RequestMapping("/welcome")
	public String info()
	{
		return"articale/info";
	}
}
