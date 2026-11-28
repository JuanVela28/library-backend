package com.tecnm.merida.library_backend.persistence.crud;

import com.tecnm.merida.library_backend.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {
}