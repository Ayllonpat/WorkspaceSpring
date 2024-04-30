package com.salesianos.dam.ejforms2patty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianos.dam.ejforms2patty.model.Producto;
import com.salesianos.dam.ejforms2patty.service.ProductoServicio;

@Controller
public class ControllerProducto {
	
	@Autowired
	private ProductoServicio service;
	
	@GetMapping("/producto")
	public String showFormProducto(Model model) {
		
		Producto producto = new Producto();
		
		model.addAttribute("productoForm", producto);
		model.addAttribute("tipos", service.getTipos());
		
		return "formProducto";
	}
	
	@PostMapping("/addProducto")
	public String submit(@ModelAttribute("productoForm")Producto producto, Model model) {
		model.addAttribute("producto", producto);
		return "view";
	}

}
