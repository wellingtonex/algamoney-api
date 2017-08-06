package com.example.algamoney.api.service.exception;

public class PessoaInvalidaException extends RuntimeException {

	private static final long serialVersionUID = -2164680760719921031L;

	public PessoaInvalidaException() {
		super("mensagem.pessoa.invalida");
	}

	
}
