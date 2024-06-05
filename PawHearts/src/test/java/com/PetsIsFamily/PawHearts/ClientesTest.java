package com.PetsIsFamily.PawHearts;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.PetsIsFamily.PawHearts.Classes.Clientes;
import com.PetsIsFamily.PawHearts.Repositórios.ClientesRepository;



@SpringBootTest
class ClientesTest {

	@Autowired
	private ClientesRepository repository;
	
	@Test
	public void testSave() {
		Clientes user = new Clientes();
		user.criarcaoDeCliente("nome","senha");
        repository.save(user);
        assertNotNull(user.getId());
	}
}
