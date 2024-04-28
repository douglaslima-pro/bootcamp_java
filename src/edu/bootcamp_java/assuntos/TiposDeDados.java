package edu.bootcamp_java.assuntos;

import java.io.*;
import java.util.Scanner;

/**
 * <h1>Objetivo</h1>
 * <p>
 * Implementar um método para cada <b>tipo primitivo</b> da linguagem Java de
 * acordo com os seguintes critérios:
 * </p>
 * <ol>
 * <li>Criar o nome do método seguindo a convenção exibir{NomeDoTipoPrimitivo}
 * em camelCase;
 * <p>
 * Exemplo: exibirDouble()
 * <p>
 * </li>
 * <li>Criar uma variável com o tipo do método;</li>
 * <li>Ler um valor do console e armazenar em uma variável;</li>
 * <li>Imprimir no console o tipo do dado;</li>
 * <li>Imprimir no console o tamanho em bytes do dado;</li>
 * <li>Retornar o valor do dado pela chamada do método;</li>
 * <li>Imprimir o valor do dado no console usando o método
 * <em>System.out.printf()</em>.</li>
 * </ol>
 * <p>
 * Github: <a href=
 * "https://github.com/douglaslima-pro">https://github.com/douglaslima-pro</a>
 * </p>
 */
public class TiposDeDados {

	private static Scanner sc = new Scanner(System.in);

	/**
	 * Método main da classe <em>TiposDeDados</em>.
	 */
	public static void main(String[] args) {
		System.out.println("***TIPOS PRIMITIVOS EM JAVA***");
		System.out.println();
		System.out.println("1. Byte");
		System.out.println("2. Short");
		System.out.println("3. Int");
		System.out.println("4. Long");
		System.out.println("5. Float");
		System.out.println("6. Double");
		System.out.println("7. Char");
		System.out.println("8. Boolean");
		System.out.println();
		System.out.print("Escolha uma opção: ");
		byte opcao = sc.nextByte();
		System.out.println();
		switch (opcao) {
		case 1:
			System.out.printf("Valor: %d", exibirByte());
			break;
		case 2:
			System.out.printf("Valor: %d", exibirShort());
			break;
		case 3:
			System.out.printf("Valor: %d", exibirInt());
			break;
		case 4:
			System.out.printf("Valor: %d", exibirLong());
			break;
		case 5:
			System.out.printf("Valor: %f", exibirFloat());
			break;
		case 6:
			System.out.printf("Valor: %f", exibirDouble());
			break;
		case 7:
			System.out.printf("Valor: %c", exibirChar());
			break;
		case 8:
			System.out.printf("Valor: %b", exibirBoolean());
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}

	public static byte exibirByte() {
		byte valor = sc.nextByte();
		System.out.println("Tipo do dado: " + Byte.TYPE);
		System.out.println("Tamanho em bytes: " + Byte.SIZE / 8);
		return valor;
	}

	public static short exibirShort() {
		short valor = sc.nextShort();
		System.out.println("Tipo do dado: " + Short.TYPE);
		System.out.println("Tamanho em bytes: " + Short.SIZE / 8);
		return valor;
	}

	public static int exibirInt() {
		int valor = sc.nextInt();
		System.out.println("Tipo do dado: " + Integer.TYPE);
		System.out.println("Tamanho em bytes: " + Integer.SIZE / 8);
		return valor;
	}

	public static long exibirLong() {
		long valor = sc.nextLong();
		System.out.println("Tipo do dado: " + Long.TYPE);
		System.out.println("Tamanho em bytes: " + Long.SIZE / 8);
		return valor;
	}

	public static float exibirFloat() {
		float valor = sc.nextFloat();
		System.out.println("Tipo do dado: " + Float.TYPE);
		System.out.println("Tamanho em bytes: " + Float.SIZE / 8);
		return valor;
	}

	public static double exibirDouble() {
		double valor = sc.nextDouble();
		System.out.println("Tipo do dado: " + Double.TYPE);
		System.out.println("Tamanho em bytes: " + Double.SIZE / 8);
		return valor;
	}

	public static char exibirChar() {
		char valor = sc.next().charAt(0);
		System.out.println("Tipo do dado: " + Character.TYPE);
		System.out.println("Tamanho em bytes: " + Character.SIZE / 8);
		return valor;
	}

	public static boolean exibirBoolean() {
		boolean valor = sc.nextBoolean();
		System.out.println("Tipo do dado: " + Boolean.TYPE);
		System.out.println("Tamanho em bytes: " + "N/A");
		return valor;
	}

}