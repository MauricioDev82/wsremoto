package decisao;

import javax.swing.JOptionPane;

public class DecisaoCompostaDesafio {

	public static void main(String[] args) {


		/*
		 * Capture:
		 * -dois times e seus respectivos placares
		 * Exiba:
		 * "Time 1 Venceu"
		 * ou
		 * "Time 2 Venceu"
		 * ou
		 * "Houve um empate"
		 * 
		 */
		String time1 = JOptionPane.showInputDialog("Time 1").toUpperCase();
		String time2 = JOptionPane.showInputDialog("Time 2").toUpperCase();
		byte placar1 = Byte.parseByte(JOptionPane.showInputDialog("Placar time 1"));
		byte placar2 = Byte.parseByte(JOptionPane.showInputDialog("Placar time 2"));



		if (placar1>placar2) {
			System.out.println("Time 1 Venceu");
		}else if (placar1<placar2) {
			System.out.println("Time 2 Venceu");
		}

		if (placar1==placar2) {
			System.out.println("Resultado Empatado");
		}
	























	}

}