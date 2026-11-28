package com.tecnm.merida.library_backend.persistence.crud;

import com.tecnm.merida.library_backend.persistence.entity.Lector;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LectorCrudRepository extends CrudRepository<Lector, String> {
    Optional<Lector> findByCorreoElectronico(String correoElectronico);
}