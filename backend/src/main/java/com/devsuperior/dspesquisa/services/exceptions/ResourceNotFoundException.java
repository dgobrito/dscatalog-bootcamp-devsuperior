package com.devsuperior.dspesquisa.services.exceptions;

// Exception = Obrigatoriamente precisa ser tratada, o compilador irá obrigar
// RuntimeException = Mais Flexível, posso ou não tratar
public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String msg) {
		super(msg);		
	}
}
