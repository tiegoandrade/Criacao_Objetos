package com.github.tiegoandrade;

/**
 * Classe utilizada para instanciar objetos.
 * 
 * @author Tiego
 *
 */
public class ServiceFactory {

	/**
	 * Instância um objeto de uma classe que implementa "Service".
	 * 
	 * @param clazz Classe que será utilizada na instanciação do objeto.
	 * @return objeto criado.
	 */
	public static <T extends Service> T newInstance(Class<T> clazz) {
		try {
			// Instancia um objeto de uma classe e o retorna.
			T obj = clazz.newInstance();
			return obj;
		} catch (Exception e) {
			return null;
		}
	}
}
