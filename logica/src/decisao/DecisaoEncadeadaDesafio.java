package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeadaDesafio {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Capturar:
		 * nome do produto
		 * genero do produto (alimenticio, eletronico.....)
		 * quantidade
		 * valor unitario
		 * voc� dever� calcular o imposto sobre o valor unit�rio
		 * se for alimenticio o imposto � 5%
		 * se for eletronico o imposto � 7%
		 * se a quantidade for maior que 100, o imposto ser� menor 1%
		 * se a quantidade for entre 50 e 100, o imposto ser� menor 0.5%
		 * se a quantidade for menor que 50 o imposto ser� integral
		 *
		 *Exibir o valor unit�rio j� com imposto
		 *
		 */
		String nomeProduto = JOptionPane.showInputDialog("Nome do Produto").toUpperCase();
		String generoProduto = JOptionPane.showInputDialog("Genero do Produto").toUpperCase();
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor Unit�rio"));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
		float taxa=0;
		
		
		if (generoProduto.equals("ALIMENTICIO")) {
			if (quantidade >100) {
				taxa = (float) 0.04;				
			}else if (quantidade >50) {
				taxa = (float) 0.05;
			}else {
				taxa = (float) 0.045;
			}
		}else if (generoProduto.equals("ELETRONICO")) {
			if (quantidade>100) {
				taxa = (float) 0.06;
			}else if (quantidade<50) {
				taxa = (float) 0.07;
			}else {
				taxa = (float) 0.065;
			}
		}else {
			System.out.println("Categoria inv�lida.");
		}
		
		System.out.println("Valor com imposto: " + (valor + valor * taxa));
		
		
		/*
		 * Padroes:
		 * - CamelCase:na composi��o com mais de uma palavra, da segunda palavra em diante deve se iniciar com letra maiscula.
		 * datanascimento - correto => dataNascimento
		 * - nomes significativos
		 * - variaveis: devem come�ar com letras minisculas
		 * - classes: devem come�ar com letras maisculos
		 * - metodo: devem ser seguidos por paratenteses
		 * 
		 * Regras:
		 * 1� N�o come�ar variavel com n�meros 
		 * 2� N�o usar palavras reservadas. Exemplo: void, public, int
		 * 3� N�o utilizar caracteres especiais. Exemplo: d@t@
		 * 
		 * 
		 */
	
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
