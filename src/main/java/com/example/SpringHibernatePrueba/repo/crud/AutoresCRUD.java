package com.example.SpringHibernatePrueba.repo.crud;

import com.example.SpringHibernatePrueba.modelo.Autores;
import com.example.SpringHibernatePrueba.repo.dao.AutoresDao;
import org.springframework.data.repository.CrudRepository;

public interface AutoresCRUD extends CrudRepository<Autores, Integer>, AutoresDao {
}
