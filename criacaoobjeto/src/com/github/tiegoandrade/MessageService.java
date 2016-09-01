package com.github.tiegoandrade;


/**
 * Classe que representa os servi�os existentes na aplica��o.
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
		System.out.println("Servi�o de mensagem");
	}
}
