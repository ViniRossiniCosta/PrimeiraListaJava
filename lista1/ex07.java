package Lists.lista1;

import javax.swing.JOptionPane;

public class ex07 {
	/*
	 * Faça um programa que carregue
	 * os valores das vendas de uma loja no
	 * primeiro semestre do ano. Considere para tal
	 * uma matriz [6,4], sendo que são 06 meses e
	 * 04 semanas por mês. Ao final, mostre na tela:
	 * ● Total de vendas do semestre
	 * ● Total vendido em cada mês
	 */
	public static void main(String[] args) {
		int[][] vendasMatriz = new int[6][4];
		int totalVendas = 0;
		int[] vendasMes = new int[6];

		for (int c = 0; c < 6; c++) {
			for (int j = 0; j < 4; j++) {
				vendasMatriz[c][j] = Integer.parseInt(JOptionPane.showInputDialog((c + 1) + " mes e semana "
						+ (j + 1) + " digite as vendas"));
				while (vendasMatriz[c][j] < 0) {
					vendasMatriz[c][j] = Integer.parseInt(JOptionPane.showInputDialog("no mes " + (j + 1)
							+ " e na semana " + (c + 1) + " não foi aceito o numero negativo\ndigite novamente"));
				}
				totalVendas += vendasMatriz[c][j];
			}
			vendasMes[c] += totalVendas;
		}
		System.out.println("Total de vendas no 1 semestre: " + totalVendas + "\n");
		for (int c = 0; c < 6; c++) {
			System.out.println("As vendas do mês " + (c + 1) + " com: " + vendasMes[c] + " no total");
		}
	}
}
