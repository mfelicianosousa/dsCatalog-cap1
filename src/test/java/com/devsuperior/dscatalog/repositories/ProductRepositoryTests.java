package com.devsuperior.dscatalog.repositories;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.EmptyResultDataAccessException;

import com.devsuperior.dscatalog.entities.Product;

@DataJpaTest
public class ProductRepositoryTests {

	@Autowired
	private ProductRepository repository;
	
	private Long existingId;
	private Long nonExistingId;
	
	@BeforeEach
	void setUp() throws Exception{
		existingId = 1L;
		nonExistingId = 1000L;
	}
	
	// Cenario de teste quando o id existe
	@Test
	public void deleteShouldDeleteObjectWhenIdExists() {
		// AAA (Arrange, Act, Assert)
		long existingId = 1L;
		repository.deleteById(existingId) ;
		
		Optional<Product> result = repository.findById(existingId);
		Assertions.assertFalse( result.isPresent() );
	}
	
	@Test
	public void deleteShouldThrowEmptyResultDataAccessExceptionWhenIdDoesNotExist() {
		// AAA (Arrange, Act, Assert)
		long nonExistingId = 1000L;
		
		Assertions.assertThrows(EmptyResultDataAccessException.class, () ->
		{
			repository.deleteById(nonExistingId) ;
			
		});
			
	}
	
	
}
