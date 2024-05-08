package edu.bootcamp_java.exercicios;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import edu.bootcamp_java.customExceptions.CPFInvalidoException;

public class CPF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um CPF no formato XXX.XXX.XXX-XX: ");
		/**
		 * Número do CPF no formato XXX.XXX.XXX-XX
		 */
		String numeroDoCPF = sc.next();
		/**
		 * Armazena true se o CPF for válido, false o contrário
		 */
		boolean CPFValido = false;
		try {
			CPFValido = CPF.validarCPF(numeroDoCPF);
		} catch (CPFInvalidoException e) {
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println();
		} finally {
			System.out.println(numeroDoCPF);
			System.out.println("CPF válido? " + (CPFValido ? "sim" : "não"));
		}
	}

	/**
	 * Verifica se o valor corresponde ao tipo {@code CPF} de acordo com o padrão
	 * esperado <strong>XXX.XXX.XXX-XX</strong>, sendo X um caractere do tipo
	 * numérico (0-9).
	 * 
	 * @param CPF
	 * @return True se o valor corresponder ao padrão esperado, false o contrário.
	 * @throws CPFInvalidoException
	 */
	public static boolean validarCPF(String CPF) throws CPFInvalidoException {
		Pattern padraoCpf = Pattern.compile("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
		Matcher matcherCpf = padraoCpf.matcher(CPF);
		if (!matcherCpf.matches()) {
			throw new CPFInvalidoException(
					"ERRO => O CPF deve estar no formato XXX.XXX.XXX-XX, sendo X um caractere do tipo numérico (0-9).");
		}
		return true;
	}

}
