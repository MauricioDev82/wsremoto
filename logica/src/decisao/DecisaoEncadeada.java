package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	/*
	 * Capturar a quantidade de faltas
	 * Para que ele seja aprovado ou de exame, ele tamb�m precisa que a quantidade de faltas seja menor que 20
	 */

	public static void main(String[] args) {
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));
		String disciplina = JOptionPane.showInputDialog("Digite a Disciplina").toUpperCase();
		if (faltas>=20) {
			System.out.println("Voc� foi reprovado por faltas");
		}else {

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1:"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2:"));
			float media = (nota1+nota2)/2;

			if (media >=6)  {
				System.out.println("Parabens voc� foi aprovado na disciplina: " + disciplina);
			}else if (media <=4) {
				System.out.println("Voc� foi Reprovado na Disciplina: " + disciplina);
			}else if (media <6 && media>=4) {
				System.out.println("Voc� ainda tem chance no exame");
			}
			System.out.println("Sua m�dia foi: " + media);
			System.out.println("Faltas: " + faltas);

		}
	}

}
