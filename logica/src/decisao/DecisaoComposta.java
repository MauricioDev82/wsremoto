package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Digite a Disciplina").toUpperCase();
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

	}

}