package repeticao;

import javax.swing.JOptionPane;

public class DoDesafio {

	public static void main(String[] args) {
		/*
		 * Miss�o 1
		 * Jogador1 vai digitar um n�mero
		 * Jogador2 vai ter que adivinhar o numero
		 * 
		 * Jogador2 s� pode receber a mensagem de "parab�ns" quando ele acertar
		 * 
		 * Miss�o 2
		 * Acrescentar dicas para o Jogador2 (n�mero menor ou maior)
		 * 
		 * Miss�o 3
		 * acrescentar na mensagem de parab�ns a quantidade de tentativas
		 * Dica: criar uma vari�vel para contar
		 * 
		 */
		
		String resposta ="";
		int jogador1 = 0;
		int jogador2 =0;
		int contagem = 0;
		
		jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1"));
		do {
			
			jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2"));
			contagem = contagem+1;
			//contagem++;
			//contagem+=1;
			
			if (jogador2>jogador1) {
				System.out.println("Digite um n�mero menor");
			}else if (jogador2<jogador1) {
				System.out.println("Digite um n�mero maior");
			}

		}while (jogador1!=jogador2); 
			System.out.println("Parab�ns Jogador 2 voc� acertou com "+ contagem +" tentativas");
			
			
		
			
		
		

	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		

	}

}