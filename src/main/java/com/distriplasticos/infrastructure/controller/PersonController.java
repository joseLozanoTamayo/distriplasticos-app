package com.distriplasticos.infrastructure.controller;

import com.distriplasticos.infrastructure.dto.PersonaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class PersonController {

    @GetMapping
    public ResponseEntity<Object> sayHello() {

        String textBlock = """
                
                prueba de 
                
                uso de texto blocks
                
                """;

        return new ResponseEntity<>(new PersonaDTO(1, "mito", textBlock, true), HttpStatus.OK);

    }
}
