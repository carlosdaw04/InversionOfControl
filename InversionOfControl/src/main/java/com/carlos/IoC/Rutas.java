package com.carlos.IoC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas {

	@GetMapping("/")
	@ResponseBody		//Esta etiqueta devuelve a la pagina web el mensaje del return
	public String rutaInicial() {
		
		
		return "todo ok";
	}
}
