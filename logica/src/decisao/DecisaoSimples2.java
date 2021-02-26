package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples2 {

	public static void main(String[] args) {
		/*
		 * Capturem:
		 * - o nome da disciplina
		 * - duas notas
		 * - calcular a media
		 * - exibir a media
		 * - exibir a mensagem "Parabéns" somente se a média for maior ou igual a 6
		 * 
		 */
		String disciplina = JOptionPane.showInputDialog("Digite a Disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2:"));
		float media = (nota1+nota2)/2;
		if (media >=6)  {
			System.out.println("Parabens você foi aprovado na disciplina: " + disciplina);
		}
		/*
		 * exibir "você foi reprovado se a média for menor que 4
		 */
		
		if (media <=4) {
			System.out.println("Você foi Reprovado na Disciplina: " + disciplina);
		}
		
		if (media <6 && media>=4) {
			System.out.println("Você ainda tem chance no exame");
		}
		System.out.println("Sua média foi: " + media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
