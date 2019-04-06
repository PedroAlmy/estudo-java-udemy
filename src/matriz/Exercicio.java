package matriz;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero de linhas: ");
		int l = sc.nextInt();
		System.out.print("Digite o numero de colunas: ");
		int c = sc.nextInt();

		int[][] matriz = new int[l][c];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite o numero da linha: " + i + " Coluna: " + j + " ");
				int n = sc.nextInt();
				matriz[i][j] = n;
			}

		}

		System.out.print("Digite um numero da matriz: ");
		int n = sc.nextInt();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (n == matriz[i][j]) {
					if (j > 0) {
						System.out.println("Numero da esquerda: " + matriz[i][j-1] + " ");
					}
					if (j < matriz.length -1) {
						System.out.println("Numero a direita: " + matriz[i][j + 1] + " ");
					}
					if (i > 0) {
						System.out.println("Numero a cima: " + matriz[i - 1][j] + " ");
					}

					if (i < matriz.length-1) {
						System.out.println("Numero a baixo: " + matriz[i + 1][j] + " ");
					}
					
				}
			}
		}
		sc.close();
		System.out.println(matriz.length);
	}
}
