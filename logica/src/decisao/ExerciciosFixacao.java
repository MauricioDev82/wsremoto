package decisao;

import javax.swing.JOptionPane;

public class ExerciciosFixacao {

	public static void main(String[] args) {

		//Exercio de Fixação 4


		float trabLab = Float.parseFloat(JOptionPane.showInputDialog("Trabalho de Laboratório"));
		float avalSem = Float.parseFloat(JOptionPane.showInputDialog("Avaliação semestral"));
		float examFinal = Float.parseFloat(JOptionPane.showInputDialog("Exame Final"));	
		float media = (trabLab+avalSem+examFinal)/3;
		
		if (media>=8 && media<=10) {
			System.out.println("Conceito A");
		}else if (media>=7 && media<=7.9) {
			System.out.println("Conceito B");
		}else if (media>=6 && media<=6.9) {
			System.out.println("Conceito C");
		}else if (media>=5 && media<=5.9) {
			System.out.println("Conceito D");
		}else if (media>=4 && media<=4.9) {
			System.out.println("Conceito E");
		}
		System.out.println("Média: " + media);
		
		
		

























	}

}
