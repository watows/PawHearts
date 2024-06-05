package com.PetsIsFamily.PawHearts.Classes;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String usuario;
    private String senha;

    @ManyToMany(mappedBy = "clientes")
    private Set<Pets> pets = new HashSet<>();

    public void criarcaoDeCliente(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public void trocaNomeUsuario(String novoUsuario){
        this.usuario = novoUsuario;
    }

    public void trocaSenhaUsuario(String novaSenha){
        this.senha = novaSenha;
    }

    public Long getId() {
        return Id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void alteraNomeCliente(String usuario2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alteraNomeCliente'");
    }
}