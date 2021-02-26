package br.com.ecommerce.modelo;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	private String fone;
	
	public Cliente() {
		
	}
	
	
	
	public Cliente(int id, String nome, String email, String fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}



	public String getAll() {
		return "Nome: " + nome + "\nEmail: " + email + "\nTelefone: " + fone + "\nID: " + id;
		
	}
	
	public void setAll(int i, String n, String e, String f) {
		id=i;
		nome=n;
		email=e;
		fone=f;
		
	}
	
	
	public String getUsuario() {
		if (email.contains("@")) {
			return email.substring(0,email.indexOf("@"));
		}
		return email;
		
		
	}
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}