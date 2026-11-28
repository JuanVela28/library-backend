package com.tecnm.merida.library_backend.persistence.crud;

import com.tecnm.merida.library_backend.persistence.entity.Prestamo;
import org.springframework.data.repository.CrudRepository;

public interface PrestamoCrudRepository extends CrudRepository<Prestamo, Integer> {
}