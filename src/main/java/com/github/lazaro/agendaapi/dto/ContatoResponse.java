package com.github.lazaro.agendaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ContatoResponse {

    private String nome;
    private String sobreNome;
    private String cpf;

}