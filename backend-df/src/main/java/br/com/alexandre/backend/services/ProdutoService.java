package br.com.alexandre.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandre.backend.models.Produto;
import br.com.alexandre.backend.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	//LISTA OS PRODUTOS CADASTRADOS
	public List<Produto> findAll(){
		return repository.findAll();
	}
	
}
