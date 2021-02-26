package variaveis;

public class TipoString {

	public static void main(String[] args) {
		//String � um tipo de Refer�ncia
		
		String email = "mauRicio.goMes-cosTa@itau-unibaNco.com.br";
		System.out.println("Original: " + email);
		System.out.println("Minisculo: " + email.toLowerCase());
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Qtde de Caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Exibir do 3� ao 5�: " + email.substring(2,5));
		System.out.println("Exibir do 5� at� o fim:" + email.substring(4));
		System.out.println("Exibir primeira metade: " + email.substring(0, email.length()/2 ));
		System.out.println("Exibir segunda metade: " + email.substring(email.length()/2));
		/*
		 * Exibir somente o nome do usu�rio do e-mail
		 */
		
		System.out.println("Nome do usu�rio: " + email.toUpperCase().substring(0, email.indexOf(".")));
		System.out.println("Comparando Primitivos: " + (7==8));
		System.out.println("Comparando Strings: " + email.equals("mauRicio.goMes-cosTa@itau-unibaNco.com.br"));
		
		
		//m a u r i c i o . g o m e s - c o s t a @ i t a u - u n i b a n c o . c o m . br
		//0 1 2 3 4 5 6 7 8 9 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
