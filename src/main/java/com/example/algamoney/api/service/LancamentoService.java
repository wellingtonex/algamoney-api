package com.example.algamoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.model.Pessoa;
import com.example.algamoney.api.repository.LancamentoRepository;
import com.example.algamoney.api.service.exception.PessoaInativaException;
import com.example.algamoney.api.service.exception.PessoaInvalidaException;

@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Autowired
	private PessoaService pessoaService;
	
	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaService.buscaPeloCodigo(lancamento.getPessoa().getCodigo());
		if (pessoa == null) {
			throw new PessoaInvalidaException();
		}
		if(pessoa.isInativa()) {
			throw new PessoaInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}
}
