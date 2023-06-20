package Lists.lista1;

import javax.swing.JOptionPane;

public class ex05 {
	/*
	 * Faça um algoritmo que peça ao usuario 10 números e
	 * mostre posteriormente quantos são pares e a soma deles,
	 * bem como quantos são ímpares e a soma deles.
	 */
	public static void main(String[] args) {
		int valor = 0;
		int addEven = 0, allEven = 0;
		int addOdd = 0, allOdd = 0;

		for (int c = 1; c < 11; c++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + c + " valor"));

			while (valor < 0) {
				valor = Integer
						.parseInt(JOptionPane.showInputDialog("Digite novamente, não aceitamos valores negativos"));
			}

			if (valor % 2 == 0) {
				addEven += 1;
				allEven += valor;
			} else {
				addOdd += 1;
				allOdd += valor;
			}
		}
		System.out.println("A soma dos pares é " + allEven + ", e sua quantidade é de " + addEven);
		System.out.println("A soma dos impares é " + allOdd + ", e sua quantidade é de " + addOdd);
	}
}
