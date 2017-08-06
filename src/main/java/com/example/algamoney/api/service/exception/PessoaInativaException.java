package com.example.algamoney.api.service.exception;

public class PessoaInativaException extends RuntimeException {

	private static final long serialVersionUID = 2191719120368596734L;

	public PessoaInativaException() {
		super("mensagem.pessoa.inativa");
	}
}
