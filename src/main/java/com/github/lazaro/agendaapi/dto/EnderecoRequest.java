package com.github.lazaro.agendaapi.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoRequest {

	private Long id;

	@NotBlank
	private String logradouro;

	@NotBlank
	private String cidade;

	@NotBlank
	private String estado;

	@NotBlank
	private String cep;
	
	private Long idContato;
}
