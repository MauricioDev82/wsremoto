package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {
		/*
		 * Capturar:
		 * -nome e idade de uma pessoa
		 * -avaliar a idade para exibir uma das mensagens abaixo:
		 * 
		 * pessoas com 16, 17 ou maior que 70 => O seu voto � facultativo
		 * pessoas entre 18 e 70 anos => Seu voto � obrigat�rio
		 * pessoas com menos de 16 anos => Voc� n�o pode votar
		 */
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		
		if (idade==16 || idade==17 || idade >70) {
			System.out.println("seu voto � facultativo");
		}
		
		if (idade>=18 && idade<=70) {
			System.out.println("Seu voto � obrigat�rio");
		}
		
		if (idade<16) {
			System.out.println("Voc� n�o pode votar");
		}
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		//&& and
		//|| or


















	}

}
