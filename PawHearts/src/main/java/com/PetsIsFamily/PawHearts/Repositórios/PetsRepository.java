package com.PetsIsFamily.PawHearts.Repositórios;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PetsIsFamily.PawHearts.Classes.Pets;

@Repository
public interface PetsRepository extends CrudRepository<Pets, Long>{
}
