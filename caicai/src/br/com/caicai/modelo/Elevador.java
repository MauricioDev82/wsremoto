package br.com.caicai.modelo;

import javax.swing.JOptionPane;

public class Elevador {
	/*
	 * * configurar(): dever� preencher os atributos andarMaximo, andarMinimo e 
capacidadeMaxima, com os par�metros recebidos respectivamente
	 * subir(): o andarAtual dever� ser incrementado em 1 somente se 
o andarAtual n�o for igual ao andarMaximo.
	 * descer(): o andarAtual dever� ser decrementado em 1 somente se 
o andarAtual n�o for igual ao andarMinimo.
	 * sair(): dever� remover o valor recebido do atributo 
qtdePessoas, desde que n�o seja menor que 0.
	 * entrar(): dever� acrescentar o valor recebido no atributo 
qtdePessoas, desde que n�o exceda a capacidade m�xima.
	 * subir (andar): dever� acrescentar ao andarAtual o par�metro recebido,
desde que n�o exceda o andarMaximo.
	 * exibirResumo(): deve exibir: andarAtual, qtdePessoas e o nome do elevador.
	 * 
	 * 
	 */


	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private short andarAtual;
	private byte capacidadeMaxima;
	private byte qtdePessoas;

	public void configurar (short maximo,short minimo,byte capacidade) {
		andarMaximo = maximo;
		andarMinimo = minimo;
		capacidadeMaxima = capacidade;


	}

	public void preencherNome(String param) {
		nome = param.toUpperCase();

	}

	public String retornarNome() {
		return nome;
	}

	public void subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
		}
	}

	public void descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;			
		}
	}

	public String entrar(byte qtde) {
		byte total = (byte) (qtdePessoas + qtde);
		if (total<=capacidadeMaxima) {
			qtdePessoas+=qtde;
			return "Entrada Realizada";
		}
		return "Entrada n�o Realizada";


	}

	public String sair(byte qtde) {
		//if ((qtdePessoas-qtde)>=0 {
		//
		//}




		if (qtdePessoas>=qtde) {
			qtdePessoas-=qtde;
			//qtdePessoas = qtdePessoas - qtde
			return "Sa�da Realizada";

		}
		return "Sa�da N�o Realizada";
	}

	public void subir(byte andar) {
		if ((andarAtual+andar)<=andarMaximo) {
			andarAtual+=andar;

		}
	}

	public String exibirResumo() {
		return "Nome do Elevador: " + nome + 
				"\nAndar: " + andarAtual + 
				"\nQtde de Pessoas: " + qtdePessoas;





	}
























































}
