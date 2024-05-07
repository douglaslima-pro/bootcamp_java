package edu.bootcamp_java.exercicios;

import java.util.regex.Pattern;
import edu.bootcamp_java.customExceptions.CPFInvalidoException;

public class CPF {

	public static void main(String[] args) {
		boolean CPFValido = false;
		try {
			CPFValido = CPF.validarCPF("048.516.061-76");
		} catch (CPFInvalidoException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("CPF válido? " + (CPFValido ? "sim" : "não"));
		}
	}

	public static boolean validarCPF(String CPF) throws CPFInvalidoException {
		if (!Pattern.matches("\\d+", CPF)) {
			throw new CPFInvalidoException("ERRO => CPF deve conter apenas números!");
		}
		if (CPF.length() != 11) {
			throw new CPFInvalidoException("ERRO => CPF deve conter 11 dígitos!");
		}
		return true;
	}

}
