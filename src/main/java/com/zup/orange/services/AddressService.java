package com.zup.orange.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zup.orange.dto.AddressDTO;
import com.zup.orange.entities.Address;
import com.zup.orange.repositories.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Transactional(readOnly = true)
	public List<AddressDTO> findAll(){
		return addressRepository.findAll().stream().map(AddressDTO::new).collect(Collectors.toList());
	}
	
	@Transactional
	public AddressDTO insert(AddressDTO dto) {
		Address entity = new Address();
		copyDtoToEntity(dto, entity);
		entity = addressRepository.save(entity);

		return new AddressDTO(entity);
	}

	private void copyDtoToEntity(AddressDTO dto, Address entity) {
		entity.setLogradouro(dto.getLogradouro());
		entity.setNumero(dto.getNumero());
		entity.setComplemento(dto.getComplemento());
		entity.setBairro(dto.getBairro());
		entity.setCidade(dto.getCidade());
		entity.setEstado(dto.getEstado());
		entity.setCep(dto.getCep());

	}
	
}
