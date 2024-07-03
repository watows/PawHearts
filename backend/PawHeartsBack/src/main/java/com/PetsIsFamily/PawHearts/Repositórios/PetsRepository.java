package com.PetsIsFamily.PawHearts.Repositórios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PetsIsFamily.PawHearts.Classes.Pets;

@Repository
public interface PetsRepository extends CrudRepository<Pets, Long>{
}
