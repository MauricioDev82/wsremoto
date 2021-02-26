package br.com.ecommerce.modelo;

public class Produto {
	/*
	 * Design Pattern - Compilado de melhores pr�ticas para orienta��o a objetos
	 *  DTO (Data Transfer Object) // TO // Beans // Java Beans // Modelo
	 *  Recomenda��es:
	 *  1� TODOS os atr�butos devem ser privados
	 *  2� CADA atributo deve possuir um m�todo de get e outro m�todo para set
	 *  3� TODA classe Beans deve possuir no minimo dois construtores:
	 *  um contrutor vazio e tamb�m um construtor com todos atributos de parametros (construtor cheio)
	 */

	/*
	 * * getTotalCompra(): retorna o valorCompra multiplicado pelo quantidade

	 * getDesconto(): retorna o valor da venda com 10% de desconto.

	 * getResumo() : retorna a descricao, valor de venda e qtde

	 * setAll() : preenche todos

	 * verificarEstoque(): vai retornar
"Estoque Alto" se a qtde for maior que 10
"Estoque Baixo" se a qtde for menor que 5
"Estoque Medio" se estiver entre 10 e 5

	 * ajustarValores(): vai aplicar a porcentagem recebida atualizando os valores de venda e compra.
	 * 
	 */

	private int id;
	private String descricao;
	private float valorCompra;
	private float valorVenda;
	private int qtde;
	
	public Produto(int i, String d, float vc, float vv, int q) {
		id=i;
		descricao=d;
		valorCompra=vc;
		valorVenda=vv;
		qtde=q;
		
		
	}
	
	public Produto() {
		
	}
	
	
	

	public void ajustarValores(float porc) {
		valorCompra = valorCompra + valorCompra * (porc/100);
		valorVenda = valorVenda + valorVenda * (porc/100);
	}

	public String verificarEstoque() {
		if (qtde<5) {
			return "Estoque Baixo";
		}else if(qtde>10) {
			return "Estoque Alto";
		}else {
			return "Estoque M�dio";
		}
	}


	public void setAll(int id, String d, float vc, float vv, int q) {
		this.id=id;
		descricao=d;
		valorCompra=vc;
		valorVenda=vv;
		qtde=q;
	}

	public String getResumo() {
		return 
				"Descri��o...: " + descricao + "\n" +
				"Valor Venda.: " + valorVenda + "\n" + 
				"Qtde........: " + qtde;
	}

	public float getDesconto() {
		return valorVenda * (float) 0.9;
	}

	public float getTotalCompra() {
		return valorCompra*qtde;
	}

	public float getTotalCompra(float frete) {
		return valorCompra * qtde + frete;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}


}


	/*


	private int id;
	private String descricao;
	private float valorCompra;
	private float valorVenda;
	private int qtde;











	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public float getTotalCompra () {
		return valorCompra*qtde;

	}

	public float getDesconto() {
		return ((float) (valorVenda*0.9));

	}

	public void getResumo(String resumo) {


	}


	public void  setAll(int id, String descricao, float valorCompra, float valorVenda, int qtde) {

	}

	public String verificarEstoque() {
		if (qtde>10) {
			return "Estoque Alto";
		}else if (qtde<5) {
			return "Estoque Baixo";
		}else if (qtde>=5 && qtde==10) {
			return "Estoque Medio";
		}
		return "Estoque total";



	}

	 */


















































