package com.zup.orange.services;

import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zup.orange.dto.AddressDTO;
import com.zup.orange.dto.UserDTO;
import com.zup.orange.entities.Address;
import com.zup.orange.entities.User;
import com.zup.orange.repositories.AddressRepository;
import com.zup.orange.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;

	@Transactional(readOnly = true)
	public List<UserDTO> findAll() {
		return userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		//Fata adicionar as Exception! 
		User entity = obj.orElseThrow();
		return new UserDTO(entity);
	}

	@Transactional
	public UserDTO insert(UserDTO dto) {
		User entity = new User();
		copyDtoToEntity(dto, entity);
		entity = userRepository.save(entity);

		return new UserDTO(entity);
	}

	private void copyDtoToEntity(UserDTO dto, User entity) {
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setCpf(dto.getCpf());
		entity.setDateOfBirth(dto.getDateOfBirth());

		entity.getAddresses().clear();
		for (AddressDTO addressDto : dto.getAddresses()) {
			Address address = addressRepository.getOne(addressDto.getId());
			entity.getAddresses().add(address);
		}

	}

}
