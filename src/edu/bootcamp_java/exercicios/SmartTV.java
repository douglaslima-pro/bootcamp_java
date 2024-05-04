package edu.bootcamp_java.exercicios;

import java.util.Scanner;

/**
 * <h1>SmartTV</h1>
 * <p>A classe SmartTV simula o comportamento de uma televisão.</p>
 * <h2>Funções</h2>
 * <ul>
 * <li>Ligar/desligar</li>
 * <li>Mudar de canal</li>
 * <li>Aumentar/diminuir volume</li>
 * </ul>
 * <h2>Informações relevantes</h2>
 * @author Douglas Souza de Lima
 * @version 1.0
 * @since 30/04/2024
 * @see <a href="https://github.com/douglaslima-pro/bootcamp_java">https://github.com/douglaslima-pro/bootcamp_java</a>
 */
public class SmartTV {

	/**
	 * True caso esteja ligada e false caso contrário.
	 */
	private boolean ligada = false;
	private int canal = 10;
	/**
	 * Valor numérico entre 0 e 100.
	 */
	private int volume = 25;

	/**
	 * Static class constructor
	 */
	public static void main(String[] args) {

		boolean sair = false;

		Scanner sc = new Scanner(System.in);
		SmartTV tv = new SmartTV();

		do {
			System.out.println();

			tv.mostrarMenu();
			int opcao = sc.nextInt();

			if (!tv.ligada) {
				switch (opcao) {
				case 1:
					System.out.println();
					tv.mostrarDetalhes();
					break;
				case 2:
					System.out.println();
					System.out.println("Ligando a TV...");
					tv.mudarEstado();
					if (tv.ligada) {
						System.out.println("TV ligada!");
					} else {
						System.out.println("Algo deu errado!");
						System.out.println("Não foi possível ligar a TV!");
					}
					break;
				case 3:
					System.out.println();
					System.out.println("Saindo do programa...");
					System.out.println("Fim da execução.");
					sair = true;
					break;
				default:
					System.out.println();
					System.out.println("Opção inválida!");
				}
			} else {
				switch (opcao) {
				case 1:
					System.out.println();
					tv.mostrarDetalhes();
					break;
				case 2:
					System.out.println();
					System.out.println("Desligando a TV...");
					tv.mudarEstado();
					if (!tv.ligada) {
						System.out.println("TV desligada!");
					} else {
						System.out.println("Algo deu errado!");
						System.out.println("Não foi possível desligar a TV!");
					}
					break;
				case 3:
					System.out.println();
					System.out.print("Digite o número do canal: ");
					int canal = sc.nextInt();
					tv.mudarCanal(canal);
					break;
				case 4:
					tv.avancarCanal();
					System.out.println();
					System.out.println("Avançando para o canal " + tv.getCanal() + "...");
					break;
				case 5:
					tv.voltarCanal();
					System.out.println();
					System.out.println("Voltando para o canal " + tv.getCanal() + "...");
					break;
				case 6:
					tv.aumentarVolume();
					System.out.println();
					System.out.println("Aumentando para o volume " + tv.getVolume() + "...");
					break;
				case 7:
					tv.diminuirVolume();
					System.out.println();
					System.out.println("Diminuindo para o volume " + tv.getVolume() + "...");
					break;
				case 8:
					System.out.println();
					System.out.println("Saindo do programa...");
					System.out.println("Fim da execução.");
					sair = true;
					break;
				default:
					System.out.println();
					System.out.println("Opção inválida!");
				}
			}
		} while (!sair);

		sc.close();
	}

	public void mostrarMenu() {
		System.out.println("SmartTV");
		System.out.println("Selecione uma opção:");
		if (!this.ligada) {
			System.out.println("1. Mostrar detalhes");
			System.out.println("2. Ligar TV");
			System.out.println("3. Sair");
		} else {
			System.out.println("1. Mostrar detalhes");
			System.out.println("2. Desligar TV");
			System.out.println("3. Mudar canal");
			System.out.println("4. Avançar canal");
			System.out.println("5. Voltar canal");
			System.out.println("6. Aumentar volume");
			System.out.println("7. Diminuir volume");
			System.out.println("8. Sair");
		}
		System.out.print("Opção: ");
	}

	public void mostrarDetalhes() {
		System.out.println("Estado: " + (this.ligada ? "ligada" : "desligada"));
		System.out.println("Canal: " + this.canal);
		System.out.println("Volume: " + this.volume);
	}

	/**
	 * Setters
	 */

	public void mudarEstado() {
		this.ligada = !this.ligada;
	}

	public void avancarCanal() {
		this.canal = (this.canal < 100) ? this.canal + 1 : 0;
	}

	public void voltarCanal() {
		this.canal = (this.canal > 0) ? this.canal - 1 : 100;
	}

	public void mudarCanal(int canal) {
		if (canal >= 0 && canal <= 100) {
			this.canal = canal;
		}
	}

	public void aumentarVolume() {
		if (this.volume < 100) {
			this.volume++;
		}
	}

	public void diminuirVolume() {
		if (this.volume > 0) {
			this.volume--;
		}
	}

	/**
	 * Getters
	 */

	public boolean getEstado() {
		return this.ligada;
	}

	public int getCanal() {
		return this.canal;
	}

	public int getVolume() {
		return this.volume;
	}

}