package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Qte Computadores"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do computador"));
		float total = quantidade*valor;
		float desc = valor * (float) 0.9;
		
		//Cast => reduz o tipo de dado na hierarquia
		
		
		System.out.println("Total..: " + total);
		System.out.println("Valor com desc: " + desc);
		
		
		/*
		 * boolean : dado lógico (True/False)
		 * char : 1 caracter sempre entre 'a' (aspas simples)
		 * =============Inteiros=================
		 * byte : de -127/+128
		 * short : de -32.000/+32.000
		 * int : de -2T/+2T
		 * long : 9.....
		 * ======================================
		 * float
		 * double : maior exatidão nas casas decimais
		 */
		
		/*
		 * Capturem:
		 *   -quantidade de computadores que existe no Itau
		 *   -Valor médio de cada computador
		 * Saida:
		 *   -Exibir o total
		 *   -Exibir o valor médio com 10% de desconto
		 */
		
		
		
		
		
		
		
		


	}

}
