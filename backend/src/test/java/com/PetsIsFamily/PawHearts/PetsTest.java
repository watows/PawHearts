package com.PetsIsFamily.PawHearts;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.PetsIsFamily.PawHearts.Classes.Pets;
import com.PetsIsFamily.PawHearts.Classes.PetsStatus;
import com.PetsIsFamily.PawHearts.Repositórios.PetsRepository;

@SpringBootTest
class PetsTest {

    @Autowired
    private PetsRepository animalRepository;

    @Test
    public void testSave() {
        Pets a1 = new Pets();
        a1.cadastroDePet("MIA", 2,"Carinhosa","Nice","Gatod de rua", PetsStatus.PARA_ADOCAO);
        animalRepository.save(a1);

        assertNotNull(a1.getId());
    }
}