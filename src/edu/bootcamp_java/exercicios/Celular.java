package edu.bootcamp_java.exercicios;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import edu.bootcamp_java.customExceptions.CelularInvalidoException;

public class Celular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número de celular no formato (XX) XXXXX-XXXX: ");
		/**
		 * Número do celular no formato (XX) XXXXX-XXXX
		 */
		String celular = sc.nextLine();
		/**
		 * Armazena true se o CPF for válido, false o contrário
		 */
		boolean celularValido = false;
		try {
			celularValido = validarCelular(celular);
		} catch (CelularInvalidoException e) {
			System.out.println();
			System.out.println(e.getMessage());
		} finally {
			System.out.println();
			System.out.println(celular);
			System.out.println("Celular válido? " + (celularValido ? "sim" : "não"));
		}
		System.out.println();
		System.out.println("Fim da execução.");
		sc.close();
	}

	/**
	 * Verifica se o valor corresponde ao tipo {@code Celular} de acordo com o
	 * padrão esperado <strong>(XX) XXXXX-XXXX</strong>, sendo X um caractere do
	 * tipo numérico (0-9).
	 * 
	 * @param celular
	 * @return True se o valor corresponder ao padrão esperado, false o contrário.
	 * @throws CelularInvalidoException
	 */
	public static boolean validarCelular(String celular) throws CelularInvalidoException {
		/**
		 * Expressão regular para dado do tipo telefone celular.
		 */
		Pattern padraoCelular = Pattern.compile("\\([0-9]{2}\\)\s[9]?[0-9]{4}[-][0-9]{4}");
		Matcher matcherCelular = padraoCelular.matcher(celular);
		if (!matcherCelular.matches()) {
			throw new CelularInvalidoException(
					"ERRO => O número do celular deve estar no formato (XX) XXXXX-XXXX, sendo X um caractere do tipo numérico (0-9).");
		}
		return true;
	}
}
