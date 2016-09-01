package com.github.tiegoandrade;


public class Aplicacao {

	public static void main(String[] args) {
		
		// Cria um objeto da classe MessageService
		MessageService service = ServiceFactory.newInstance(MessageService.class);
		
		// Executa o m�todo dessa classe.
		service.execute();
	}

}
