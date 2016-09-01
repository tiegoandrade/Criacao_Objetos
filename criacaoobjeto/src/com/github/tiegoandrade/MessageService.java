package com.github.tiegoandrade;


/**
 * Classe que representa os serviços existentes na aplicação.
 * 
 * @author Tiego
 *
 */
public class MessageService implements Service {
	
	/**
	 * @see com.github.tiegoandrade.Service#execute() 
	 */
	@Override
	public void execute() {
		System.out.println("Serviço de mensagem");
	}
}
