package edu.bootcamp_java.assuntos;

import java.lang.Math;

public class EstruturasDeRepeticao {

	public static void main(String[] args) {
		imprimirNumerosPares(0, 100);
		System.out.println("Fim da execução.");
	}

	public static void imprimirArrayComFor() {
		String[] nomes = { "Douglas", "Julia", "Gabriel", "Rafaela", "Elizabeth" };
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("O nome no índice " + i + " é " + nomes[i]);
		}
	}

	public static void imprimirArrayComForEach() {
		int[] numeros = new int[10];
		int i;
		for (i = 0; i < 10; i++) {
			numeros[i] = (int) Math.pow((i * 2), 2);
		}
		i = 0;
		/**
		 *  for-each loop é uma versão reduzida do laço for
		 *  : significa "in"
		 *  a instrução pode ser lida como "para cada numero em numeros faça..."
		 */
		for (int numero : numeros) {
			System.out.println("O número no índice " + i + " é " + numero);
			i++;
		}
	}

	public static void imprimirNumerosPares(int ini, int fim) {
		while (ini <= fim) {
			if (ini % 2 != 0) {
				ini++;
				continue; // continue quebra apenas uma iteração do laço de repetição
			}
			System.out.println(ini);
			ini++;
		}
	} 

}
