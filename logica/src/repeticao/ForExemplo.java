package repeticao;

import javax.swing.JOptionPane;

public class ForExemplo {

	public static void main(String[] args) {
	/*
	 * For: proprio para situa��es onde n�o h� intera��o com o usu�rio final
	 * Sitaxe:
	 * - definir contador e inicio
	 * - condi��o
	 * - como ele vai contar 
	 * 	
	 */
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a Tabuada"));
		for (int contador=1;contador<11;contador++) {
		System.out.println(tabuada +  " x " + contador + " = " + (tabuada*contador));
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
