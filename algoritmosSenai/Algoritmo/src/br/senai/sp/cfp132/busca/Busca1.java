package br.senai.sp.cfp132.busca;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Busca1 {
	public static void main(String[] args) {
		int[] vetor = new int[1000];
		Scanner leitor = new Scanner(System.in);
		Random rand = new Random();

		for (int i = 0; i < vetor.length; i++) {
			// System.out.print("Digite o "+(i+1)+"º numero: ");
			vetor[i] = rand.nextInt(5000);
		}

		Arrays.sort(vetor);
		System.out.print("Digite o numero a ser procurado: ");

		/*
		 * if(buscar(vetor,leitor.nextInt())){ System.out.println("encontrado");
		 * }else{
		 * 
		 * }
		 */

		System.out.println(buscar(leitor.nextInt(), vetor));
		System.out.println(busca1(vetor,leitor.nextInt()));

	}

	public static boolean buscar(int[] vetor, int elemento) {
		for (int numero : vetor) {
			if (numero == elemento) {
				return true;
			}
		}

		return false;
	}

	public static String buscar(int elemento, int vetor[]) {
		String msg = "";
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == elemento) {
				long tempof = System.currentTimeMillis() - inicio;
				return "Numero: " + vetor[i] + ", encontrado na posição " + i
						+ " Tempo gasto foi de = " + tempof;

			}
		}
		long tempof = System.currentTimeMillis() - inicio;
		return " Elemento Não Encontrado! Tempo Gasto " + tempof;
	}

	public static int busca1(int[] vetor, int elemento) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == elemento) {
				return i;
			}
		}

		return -1;

	}

}
