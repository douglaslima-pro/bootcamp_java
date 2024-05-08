package edu.bootcamp_java.customExceptions;

/**
 * <p>Exceção disparada por um objeto do tipo {@code Celular}, indicando que o valor fornecido não se adequa ao padrão do tipo esperado.
 * 
 * @since 08/05/2024
 */
public class CelularInvalidoException extends Exception {

	public CelularInvalidoException(String errorMessage) {
		super(errorMessage);
	}
	
	public CelularInvalidoException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}
}
