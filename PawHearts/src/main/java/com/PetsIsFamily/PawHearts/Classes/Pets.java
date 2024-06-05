package com.PetsIsFamily.PawHearts.Classes;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

// import com.PetsIsFamily.PawHearts.Classes.PetsStatus;

@Entity
public class Pets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nomePet;
    private int idadePet;
    private String descricaoPet;
    private String cidadePet;
    private String racaPet;
    
    @Enumerated(EnumType.STRING)
    private PetsStatus status;

    @ManyToMany
    private Set<Clientes> clientes = new HashSet<>();

    public void cadastroDePet(String nomePet, int idadePet, String descricaoPet, String cidadePet, String racaPet, PetsStatus status){
        this.nomePet = nomePet;
        this.idadePet = idadePet;
        this.descricaoPet = descricaoPet;
        this.cidadePet = cidadePet;
        this.racaPet = racaPet;
        this.status = status;
    }

    public void alteraNomePet(String novoNomePet){
        this.nomePet = novoNomePet;
    }

    public void alteraIdadePet(int novaIdadePet){
        this.idadePet = novaIdadePet;
    }

    public void alteraDescricaoPet(String novaDescricaoPet){
        this.descricaoPet = novaDescricaoPet;
    }

    public void alteraCidadePet(String novaCidadePet){
        this.cidadePet = novaCidadePet;
    }

    public void alteraRacaPet(String novaRacaPet){
        this.racaPet = novaRacaPet;
    }

    public Long getId() {
        return Id;
    }

    public String getNomePet() {
        return nomePet;
    }

    public int getIdadePet() {
        return idadePet;
    }
    public String getDescricaoPet() {
        return descricaoPet;
    }

    public String getCidadePet() {
        return cidadePet;
    }

    public String getRacaPet() {
        return racaPet;
    }

    public PetsStatus getStatus() {
        return status;
    }

}
