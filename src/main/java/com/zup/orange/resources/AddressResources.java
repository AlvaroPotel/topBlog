package com.zup.orange.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.zup.orange.dto.AddressDTO;
import com.zup.orange.dto.UserDTO;
import com.zup.orange.services.AddressService;

@RestController
@RequestMapping(value = "/addresses")
public class AddressResources {
	
	@Autowired
	private AddressService service;

	@GetMapping
	public ResponseEntity<List<AddressDTO>> findAll() {
		List<AddressDTO> result = service.findAll();
		return ResponseEntity.ok(result);
	}
	
	@PostMapping
	public ResponseEntity<AddressDTO> insert(@RequestBody AddressDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
}
