package com.github.lazaro.agendaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EnderecoResponse {

    private String logradouro;
    private String cidade;
    private String estado;
    private String cep;

}
