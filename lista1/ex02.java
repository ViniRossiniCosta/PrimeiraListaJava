package Lists.lista1;

import javax.swing.JOptionPane;

public class ex02 {
	/*
	 * Desenvolva um programa que pergunte qual é a maioridade
	 * civil do seu estado e que posteriormente o usuario
	 * informe sua idade. Como resultado,
	 * o programa deve informar se ele é ou não maior de idade.
	 */
	public static void main(String[] args) {
		int cidadeEstado = Integer.parseInt(JOptionPane.showInputDialog("Digite a maior idade em sua cidade/estado"));
		while (cidadeEstado < 0) {
			cidadeEstado = Integer.parseInt(JOptionPane.showInputDialog("Digite a maior idade em sua cidade/estado"));
		}

		int idadeAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade atual"));
		while (idadeAtual < 0) {
			idadeAtual = Integer
					.parseInt(JOptionPane.showInputDialog("Sua idade não pode ser negativa, digite novamente"));
		}

		if (cidadeEstado < idadeAtual) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você não é maior idade");
		}
	}
}
