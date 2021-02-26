package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		
		
		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Dia"));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Mês"));
		String ano = JOptionPane.showInputDialog("Ano");
		
		while (dia>31 || dia<1) {
			System.out.println("Dia invalido");
			dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
		}
		while (mes>12 || mes<1) {
			System.out.println("Mês invalido");
			mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mes novamente"));
			
		}
		while (ano.length()!=4) {
			System.out.println("Ano invalido");
			ano = JOptionPane.showInputDialog("Digite o ano novamente");
			
		}
		System.out.println(dia + " / " + mes + " / " + ano);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
