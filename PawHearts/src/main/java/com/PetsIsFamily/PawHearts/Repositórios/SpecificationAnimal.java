package com.PetsIsFamily.PawHearts.Repositórios;


import org.springframework.data.jpa.domain.Specification;


import com.PetsIsFamily.PawHearts.Classes.Pets;

public class SpecificationAnimal {
//Meio desncessário, as funções básicas da API já podem fazer os finds e o que for preciso, se der para remover ficaria melhor de se trabalhar e deixaria mais "limpo" o projeto.
	public static Specification<Pets> nome(String nome){
		return (root, criteriaQuery, criteriaBuilder) ->
				criteriaBuilder.like(root.get("nome"), "%" + nome + "%");
	}
	
	public static Specification<Pets> especie(String especie){
		return (root, criteriaQuery, criteriaBuilder) ->
				criteriaBuilder.like(root.get("especie"), especie);
	}

	public static Specification<Pets> status(String status){
		return (root, criteriaQuery, criteriaBuilder) ->
				criteriaBuilder.like(root.get("status"), status);
	}
}
