package com.ItzJuls.PrimerMVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllers {
	@GetMapping("/")
public String saludo()
{
	return "Ejemplo";
	}
	
	@GetMapping("/Ejemplo1")
public String Ejemplo1()
{
	return "Ejemplo1";
	}
}
