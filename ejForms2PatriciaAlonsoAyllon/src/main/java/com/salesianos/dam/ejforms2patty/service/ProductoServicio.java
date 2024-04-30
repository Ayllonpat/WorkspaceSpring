package com.salesianos.dam.ejforms2patty.service;

import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {

	public String[] getTipos() {
		String[] tipos = new String[] {"Larger", "Pilsen", "Guiness", "Sin filtrar", "Serranito"};
		return tipos;
	}
	
}
