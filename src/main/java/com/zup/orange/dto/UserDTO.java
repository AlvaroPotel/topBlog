package com.zup.orange.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.zup.orange.entities.User;

public class UserDTO {
	
	private Long id;

	@Size(min = 5, max = 80, message = "Deve ter entre 5 a 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String name; 
	
	@Size(min = 5, max = 80, message = "Deve ter entre 5 a 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String email;
	
	@Size(min = 5, max = 80, message = "Deve ter entre 5 a 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String cpf;
	
	@NotBlank(message = "Campo requerido")
	private Date dateOfBirth;
	
	private List<AddressDTO> addresses = new ArrayList<>();
	
	public UserDTO() {
	}

	public UserDTO(Long id, String name, String email, String cpf, Date dateOfBirth, List<AddressDTO> addresses) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.dateOfBirth = dateOfBirth;
		this.addresses = addresses;
	}
	
	public UserDTO(User user) {
		id = user.getId();
		name = user.getName();
		email = user.getEmail();
		cpf = user.getCpf();
		dateOfBirth = user.getDateOfBirth();
		addresses = user.getAddresses().stream().map(x -> new AddressDTO(x)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<AddressDTO> getAddresses() {
		return addresses;
	}
	
}
