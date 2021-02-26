package repeticao;

import javax.swing.JOptionPane;

public class ForExemplo {

	public static void main(String[] args) {
	/*
	 * For: proprio para situações onde não há interação com o usuário final
	 * Sitaxe:
	 * - definir contador e inicio
	 * - condição
	 * - como ele vai contar 
	 * 	
	 */
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a Tabuada"));
		for (int contador=1;contador<11;contador++) {
		System.out.println(tabuada +  " x " + contador + " = " + (tabuada*contador));
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
