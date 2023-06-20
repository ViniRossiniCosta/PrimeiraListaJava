package Lists.lista1;

import javax.swing.JOptionPane;

public class ex06 {
	/*
	 * Faça uma solução que alimente um vetor com 10
	 * valores inteiros e também que solicite ao usuário
	 * a entrada de dados de um valor inteiro qualquer.
	 * A solução deverá fazer uma busca do valor,
	 * informado pelo usuário, no vetor e imprima a
	 * posição em que este foi encontrado ou se não foi
	 * encontrado.
	 */
	public static void main(String[] args) {
		int[] vetor = new int[10];
		int escolha;

		for (int c = 0; c < 10; c++) {
			vetor[c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (c + 1) + " valor"));
			while (vetor[c] < 0) {
				vetor[c] = Integer
						.parseInt(JOptionPane.showInputDialog("valores negativos não são aceitos, digite novamente"));
			}
			;
		}
		escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual número deseja achar a posição"));
		for (int c = 0; c < 10; c++) {
			if (escolha == vetor[c]) {
				System.out.println(escolha + " o valor " + c);
			}
		}
	}
}
