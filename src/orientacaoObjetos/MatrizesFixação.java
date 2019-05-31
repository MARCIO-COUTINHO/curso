package orientacaoObjetos;

import java.util.Scanner;

/*Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo
3 4
10 8 15 12
21 11 23 8
14 5 13 19
8
Position 0,1:
Left: 10
Right: 15
Down: 11
Position 1,3:
Left: 23
Up: 12
Down: 19
*/
public class MatrizesFixação {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe n(linhas) e m(colunas): ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];

		System.out.println("Informe os números: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		boolean achou = false;
		System.out.println("Informe um número pertencente à matriz: ");
		int x = sc.nextInt();
		while (!achou) {
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (x == mat[i][j]) {
						achou = true;
						break;
					}
				}
			}
			if (!achou) {
				System.out.println("Número não pertence à matriz! Informe outro número: ");
				x = sc.nextInt();
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (x == mat[i][j]) {
					System.out.println("Posição " + i + "," + j);
					if (j > 0 && j < mat[i].length) {
						System.out.println("Esquerda " + mat[i][j-1]);
					}
					if (j > 0 && j < mat[i].length - 1) {
						System.out.println("Direita " + mat[i][j+1]);
					}
					if (i > 0 && i < mat.length) {
						System.out.println("Acima " + mat[i-1][j]);
					}
					if (i > 0 && i < mat.length - 1) {
						System.out.println("Abaixo " + mat[i+1][j]);
					}
				}
			}
		}
		System.out.println();

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);

		sc.close();
	}
}
