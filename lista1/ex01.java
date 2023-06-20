package Lists.lista1;

import javax.swing.JOptionPane;

public class ex01 {
	/**
	 * Fa�a um algoritmo que pe�a para o usu�rio inserir
	 * uma quantidade em horas,
	 * outra em minutos e mais uma em segundos
	 * e mostre quantos segundos esse hor�rio cont�m.
	 */
	public static void main(String[] args) {

		int tempHoras = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas atuais"));
		while (tempHoras < 0) {
			tempHoras = Integer.parseInt(JOptionPane.showInputDialog("N�o exisem horas negativas!\nDigite novamente"));
		}

		int tempMinitos = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos atuais"));
		while (tempMinitos < 0) {
			tempMinitos = Integer
					.parseInt(JOptionPane.showInputDialog("N�o exisem minutos negativos!\nDigite novamente"));
		}

		int tempSegundos = Integer.parseInt(JOptionPane.showInputDialog("Digite os segundos atuais"));
		while (tempSegundos < 0) {
			tempSegundos = Integer
					.parseInt(JOptionPane.showInputDialog("N�o exisem segundos negativos!\nDigite novamente"));
		}

		int horasSegundos = tempHoras * 3600;
		int minutosSegundos = tempMinitos * 60;

		System.out.println(tempHoras + " hora(s) em segundos," + horasSegundos + "s");
		System.out.println(tempMinitos + " minuto(s) em segundos," + minutosSegundos + "s");
		System.out.println(tempSegundos + " segundo(s) em segundos," + tempSegundos + "s");

	}
}
