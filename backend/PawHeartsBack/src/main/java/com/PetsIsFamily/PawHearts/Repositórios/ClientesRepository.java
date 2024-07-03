package com.PetsIsFamily.PawHearts.Repositórios;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PetsIsFamily.PawHearts.Classes.Clientes;

@Repository
public interface ClientesRepository extends CrudRepository<Clientes, Long>{
}
