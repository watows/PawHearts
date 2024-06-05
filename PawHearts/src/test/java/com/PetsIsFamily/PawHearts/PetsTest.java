package com.PetsIsFamily.PawHearts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

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