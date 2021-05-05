package com.zup.orange.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.zup.orange.entities.Address;

public class AddressDTO {
	
	private Long id;

	@Size(min = 5, max = 80, message = "Deve ter entre 5 a 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String logradouro;
	
	@Size(min = 5, max = 80, message = "Deve ter entre 5 a 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String numero;
	
	@Size(min = 5, max = 80, message = "Deve ter entre 5 a 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String complemento;
	
	@Size(min = 5, max = 80, message = "Deve ter entre 5 a 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String bairro; 
	
	@Size(min = 5, max = 80, message = "Deve ter entre 5 a 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String cidade;
	
	@Size(min = 5, max = 80, message = "Deve ter entre 5 a 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String estado;
	
	@Size(min = 5, max = 80, message = "Deve ter entre 5 a 80 caracteres")
	@NotBlank(message = "Campo requerido")
	private String cep;
	
	public AddressDTO() {
	}
	
	public AddressDTO(Long id, String logradouro, String numero, String complemento, String bairro, String cidade, String estado,
			String cep) {
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	public AddressDTO(Address address) {
		id = address.getId();
		logradouro = address.getLogradouro();
		numero = address.getNumero();
		complemento = address.getComplemento();
		bairro = address.getBairro();
		cidade = address.getCidade();
		estado = address.getEstado();
		cep = address.getCep();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
