package com.f5promotora.cursomc.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.f5promotora.cursomc.domain.Cliente;
import com.f5promotora.cursomc.services.ClienteService;


@RestController
@RequestMapping(value ="/clientes")
public class ClienteResources {
	
	@Autowired
	private ClienteService service; 

	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		
		Cliente obj = null;
		obj = service.find(id);
				
		return ResponseEntity.ok().body(obj);
	}
}
