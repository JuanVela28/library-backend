package com.tecnm.merida.library_backend.persistence.crud;

import com.tecnm.merida.library_backend.persistence.entity.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroCrudRepository extends CrudRepository<Libro, Integer> {
}