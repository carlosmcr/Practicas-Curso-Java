package net.impactotecnologico.mvc.demo.controller;

import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.impactotecnologico.mvc.demo.model.Categoria;

@Controller
public class CategoriaController {

//	@RequestMapping(path = { "/categoria" }, method = RequestMethod.GET)
//	public String sayHello(Model model) {
//
//		Categoria cat = new Categoria(1, "Categoria");
//
//		JSONObject json = new JSONObject();
//		json.put("id", cat.getId());
//		json.put("nombre", cat.getNombre());
//
//		model.addAttribute("categoriaId", cat.getId());
//		model.addAttribute("json", json);
//
//		return "categoria";
//	}

	// Devuelve un JSON
	@RequestMapping(path = { "/categoria" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String sayHello(Model model) {

		Categoria cat = new Categoria(1, "Categoria");

		JSONObject json = new JSONObject();
		json.put("id", cat.getId());
		json.put("nombre", cat.getNombre());

		return json.toString();
	}
}
