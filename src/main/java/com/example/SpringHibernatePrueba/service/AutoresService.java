package com.example.SpringHibernatePrueba.service;

import com.example.SpringHibernatePrueba.modelo.Autores;
import com.example.SpringHibernatePrueba.repo.crud.AutoresCRUD;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoresService {
    private AutoresCRUD autoresCRUD;

    public AutoresService(AutoresCRUD autoresCRUD) {
        this.autoresCRUD = autoresCRUD;
    }

    public List<Autores> todos() {
        return (List<Autores>) autoresCRUD.findAll();
    }
}
