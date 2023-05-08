package com.salesianostriana.dam.ejemplo04BuclesySwitch;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	public List <Product> getLista(){
		return Arrays.asList(
				new Product(1, "Botijo", "Enfria agua hasta menos 10 grados", 20.5055, true, LocalDateTime.now()),
				new Product(2, "BotijoExtra", "Enfria agua hasta menos 200 grados", 19.99, true, LocalDateTime.now()));
	}
	
	

}
