package br.com.ecommerce.principal;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Criando objeto
		Produto p2;
		
		//Instanciando objeto
		Produto p = new Produto();
		p.setDescricao(JOptionPane.showInputDialog("Descri��o").toUpperCase());
		p.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Quantidade")));
		p.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("V Compra")));
		p.setValorVenda(Float.parseFloat(JOptionPane.showInputDialog("V Venda")));
		p.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
		
		System.out.println(p.getResumo());
		
		System.out.println("Desconto: " + p.getDesconto());
		p.ajustarValores(50);
		System.out.println("\nValores Ajustados: ");
		System.out.println(p.getResumo());
		System.out.println("Total Compra: " + p.getTotalCompra());
		System.out.println("Situa��o do estoque: " + p.verificarEstoque());
		
		
		
		
		
		
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
