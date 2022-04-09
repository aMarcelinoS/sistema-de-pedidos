package br.com.alexandre.backend.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.alexandre.backend.models.Produto;
import br.com.alexandre.backend.repositories.ProdutoRepository;
import br.com.alexandre.backend.services.ProdutoService;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		Produto p1 = new Produto(null, "Sanduíche Bovino", "X-Burguer", 16.00);
		Produto p2 = new Produto(null, "Sanduíche Bovino", "X-Tudo", 20.00);		
		produtoRepository.saveAll(Arrays.asList(p1, p2));
	}	
}
