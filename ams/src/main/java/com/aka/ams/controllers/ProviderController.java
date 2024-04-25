package com.aka.ams.controllers;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //pour la classe devient un Controller qui gere les routes de routage dans l'app web
public class ProviderController {
	// une action
	@RequestMapping("/welcome") // pour que "/welcome soit un route
	//@ResponseBody // il affiche resultat du return en browser
	public String welcome(Model model)
	{
	//return "<h1>Hello Spring<h1>";
		String desc = "formation fullstack";
		model.addAttribute("desc", desc);
		return "provider/welcome";
	}
	
	// autre action
	@RequestMapping("/details")
	//@ResponseBody
	public String details(Model model)
	{
		//return "<h2> Hello MVC Layer<H2>";
		String names[] = {"abdu", "hasna", "mahdi", "slimen"};
		model.addAttribute("name", names);
		return "provider/details";
	}
	
	@RequestMapping("/list")
	public String list(Model model)
	{
		List<Provider> providers = new ArrayList<>();
		providers.add(new Provider("Samsung", "NorthKorea", "55444455" ));
		providers.add(new Provider("Canon", "Japon", "55778455"));
		providers.add(new Provider("Evertek", "Tunisia", "55554466" ));
		model.addAttribute("pro", providers);
		return "provider/list";
		
	}

}
