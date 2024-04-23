package com.salesianos.dam.ejemplobuclesswitch;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	public List<Product> getLista(){
		return Arrays.asList(
				new Product(1, "Botijo", "Enfria hasta -10g", 20.5055, true, LocalDateTime.now()),
				new Product(2, "fjsf", "enfria", 13, false, LocalDateTime.now()));
				
	}
	
}
