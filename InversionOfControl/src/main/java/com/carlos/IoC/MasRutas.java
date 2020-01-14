package com.carlos.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carlos.IoC.servicio.ComponenteNombres;

@Controller
public class MasRutas {

	
	@Autowired
	public ComponenteNombres componenteNombres;
	
	@GetMapping("/singleton2")
	@ResponseBody		//Esta etiqueta devuelve a la pagina web el mensaje del return
	public String rutaSingleton() {
		
		return componenteNombres.toString();
	}
	
}
