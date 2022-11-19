package com.example.SpringHibernatePrueba.view;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;

@Scope(value = "session")
@Component
@Data
public class PruebaController implements Serializable {

    private String hola = "Holll";

    @PostConstruct
    public void init () {
        System.out.println("........");
    }

}
