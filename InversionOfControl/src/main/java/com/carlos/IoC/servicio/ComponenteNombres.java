package com.carlos.IoC.servicio;

import org.springframework.stereotype.Service;

@Service
public class ComponenteNombres {

	public String[] getNombres() {
		
		String[] nombres = {"Paco", "Juan", "Maria"};
		
		return nombres;
		
	}
}
