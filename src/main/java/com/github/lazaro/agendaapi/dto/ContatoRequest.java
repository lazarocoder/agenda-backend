package com.github.lazaro.agendaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
public class ContatoRequest {

    private Long id;

    @NotBlank(message = "O campo 'nome' é obrigatório")
    @Size(max = 100, message = "O campo 'nome' deve ter no máximo 100 caracteres")
    private String nome;

    @NotBlank(message = "O campo 'sobreNome' é obrigatório")
    @Size(max = 100, message = "O campo 'sobreNome' deve ter no máximo 100 caracteres")
    private String sobreNome;

    @NotBlank(message = "O campo 'cpf' é obrigatório")
    @Size(max = 11, message = "O campo 'cpf' deve ter no máximo 11 caracteres")
    @Pattern(regexp = "\\d{11}", message = "O campo 'cpf' deve conter apenas dígitos")
    private String cpf;

    @NotBlank(message = "O campo 'email' é obrigatório")
    @Size(max = 100, message = "O campo 'email' deve ter no máximo 100 caracteres")
    @Email(message = "O campo 'email' deve ser um endereço de e-mail válido")
    private String email;

    public ContatoRequest() {
    }

}
