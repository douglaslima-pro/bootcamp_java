package edu.bootcamp_java.customExceptions;

/**
 * <p>Exceção disparada por um objeto do tipo {@code CPF}, indicando que o valor fornecido não se adequa ao padrão do tipo esperado.</p>
 * 
 * @since 07/05/2024
 */
public class CPFInvalidoException extends Exception {

	
	public CPFInvalidoException(String errorMessage) {
		super(errorMessage);
	}
	
	public CPFInvalidoException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}
}