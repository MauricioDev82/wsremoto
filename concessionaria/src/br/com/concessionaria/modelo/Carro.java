package br.com.concessionaria.modelo;

public class Carro {
	private float valor; 
	private String cor;
	private boolean status;
	private short velocidadeAtual;
	private String modelo;
	
	
	
	
	public void preecherValor(float param) {
		valor = param;
		
	}
	
	public float retornarValor() {
		return valor;
		
	}
	
	public void ligar () {
		status = true;
	
	}
	
	public void desligar () {
		status = false;
		velocidadeAtual = 0;
		
		
	}
	 
	public void acelerar (short velocidade) {
		if (status==true) {
			velocidadeAtual = (short) (velocidadeAtual + velocidade);
		}
		
	}
	
	public void brecar (short velocidade) {
		if (status==true) {
			velocidadeAtual = (short) (velocidadeAtual - velocidade);
		}
		
		
	}
	
	public String retornarResumo() {
		String strstatus = "LIGADO";
		if (status==false) {
			strstatus = "DESLIGADO";
		}
		return "Modelo " + modelo +
				"\nStatus "  + strstatus +
				"\nVelocidade " + velocidadeAtual;
		
		
	}
	
	
	public String retornarCor() {
		return cor;
	}

	
	//sintaxe para os m�todos:
	//<modificador> <tipo do retorno> <nome do met�do> (<tipo do param> <nome do param>) {
	public void preencherCor(String param) {
		cor = param.toUpperCase();
	
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
