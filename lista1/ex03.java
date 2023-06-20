package Lists.lista1;

import javax.swing.JOptionPane;

public class ex03 {
	/*
	 * Fa�a um programa que pe�a ao usu�rio para informar
	 * 03 n�meros e mostre o menor entre eles.
	 * Considere que o usu�rio n�o poder� informar
	 * n�meros iguais.
	 */
	public static void main(String[] args) {

		int menorV = 0;

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1 numero"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 numero"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3 numero"));

		if ((valor == valor2) || (valor2 == valor3) || (valor == valor3) || (valor2 == valor) || (valor3 == valor)) {
			System.out.println("numúros iguais não são aceitos, tente novamente");
		} else if ((valor < valor2) && (valor < valor3)) {
			menorV = valor;
			System.out.println("O menor valor é " + menorV);
		} else if ((valor2 < valor) && (valor2 < valor3)) {
			System.out.println("O menor valor é " + menorV);
		} else if ((valor3 < valor) && (valor3 < valor2)) {
			System.out.println("O menor valor é " + menorV);
		}
	}
}
