package com.github.lazaro.agendaapi.api.rest;

import com.github.lazaro.agendaapi.api.rest.controller.ContatoController;
import com.github.lazaro.agendaapi.dto.ContatoRequest;
import com.github.lazaro.agendaapi.model.entity.Contato;
import com.github.lazaro.agendaapi.model.entity.Endereco;
import com.github.lazaro.agendaapi.services.ContatoService;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

class ContatoControllerTest {

    private ContatoService contatoService;

    @Test
    void getTenFist() {

        /*Contato contato1 = new Contato();
        Contato contato2 = new Contato();
        List<Contato> contatos = Arrays.asList(contato1, contato2);
        when(contatoService.findAll()).thenReturn(contatos);
        ContatoController contatoController = new ContatoController(contatoService);
        ResponseEntity<List<Contato>> responseEntity = contatoController.getTenFist();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(contatos, responseEntity.getBody());*/
    }


    @Test
    void getById() {

        /*Long idExistente = 1L;
        Contato contatoExistente = new Contato();
        when(contatoService.findById(idExistente)).thenReturn(Optional.of(contatoExistente));
        ContatoController contatoController = new ContatoController(contatoService);
        ResponseEntity<Contato> responseEntity = contatoController.getById(idExistente);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(contatoExistente, responseEntity.getBody());*/

    }

    @Test
    void getEnderecoByIdContato() {
        /*List<Endereco> enderecosExistente = List.of(
                new Endereco("Rua A", "12345-678", "Cidade A"),
                new Endereco("Rua B", "98765-432", "Cidade B")
        );*/

        /*Long idExistente = 1L;
        when(contatoService.findByIdContato(idExistente)).thenReturn(Optional.of(enderecosExistente));
        ContatoController contatoController = new ContatoController(contatoService);
        ResponseEntity<List<Endereco>> responseEntity = contatoController.getEnderecoByIdContato(idExistente);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(enderecosExistente, responseEntity.getBody());*/
    }

    @Test
    void save() throws Exception {

        /*ContatoRequest contatoRequest = new ContatoRequest();
        contatoRequest.setNome("John");
        contatoRequest.setSobreNome("Doe");
        contatoRequest.setCpf("12345678901");
        contatoRequest.setEmail("john.doe@example.com");


        doNothing().when(contatoService).salvarContato(contatoRequest);

        ContatoController contatoController = new ContatoController(contatoService);
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(contatoController).build();


        mockMvc.perform(MockMvcRequestBuilders.post("/api/contatos")
                        .content(objectMapper.writeValueAsString(contatoRequest))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isCreated());*/
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}