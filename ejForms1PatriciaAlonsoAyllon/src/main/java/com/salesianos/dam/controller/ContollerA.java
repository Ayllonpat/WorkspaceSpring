package com.salesianos.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianos.dam.model.Enpleado;

@Controller
public class ContollerA {
	
	@GetMapping("/empleado")
	public String showForm(Model model) {
		Enpleado enpleado = new Enpleado();
		model.addAttribute("enpleadoForm", enpleado);
		return "from";
	}
	
	@PostMapping("/addEmpleado")
	public String submit(@ModelAttribute("enpleadoForm") Enpleado enpleado, Model model) {
		model.addAttribute("enpleado", enpleado);
		return "view";
	}

}
