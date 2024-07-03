package com.PetsIsFamily.PawHearts.Api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.PetsIsFamily.PawHearts.Classes.Pets;
import com.PetsIsFamily.PawHearts.Repositórios.PetsRepository;

@RestController
@RequestMapping("/api/pets")
public class PetsAPI {

    @Autowired
    private PetsRepository petsRepository;

    @PostMapping("/")
    public ResponseEntity<Pets> criarPets(@Validated @RequestBody Pets pets) {
        Pets novoPet = petsRepository.save(pets);
        return new ResponseEntity<>(novoPet, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pets> buscarPetsPorId(@PathVariable Long id) {
        Optional<Pets> petOpcional = petsRepository.findById(id);
        return petOpcional.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/")
    public ResponseEntity<List<Pets>> buscarTodaspets() {
        List<Pets> pets = (List<Pets>) petsRepository.findAll();
        return ResponseEntity.ok(pets);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pets> atualizarPets(@PathVariable Long id, @Validated @RequestBody Pets novoPet) {
        Optional<Pets> petOpcional = petsRepository.findById(id);
        if (petOpcional.isPresent()) {
            Pets petsExiste = petOpcional.get(); 
            petsExiste.alteraNomePet(novoPet.getNomePet());
            petsExiste.alteraDescricaoPet(novoPet.getDescricaoPet());
            petsExiste.alteraIdadePet(novoPet.getIdadePet());
            petsExiste.alteraRacaPet(novoPet.getRacaPet());
            petsExiste.alteraCidadePet(novoPet.getCidadePet());
            Pets petsAtualizados = petsRepository.save(petsExiste);
            return ResponseEntity.ok(petsAtualizados);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPets(@PathVariable Long id) {
        if (petsRepository.existsById(id)) {
            petsRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

