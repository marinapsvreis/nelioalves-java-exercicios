package comparandoObjetosEqualsHashCode;

public class TesteClient {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "alex@gmail.com");
		Client c3 = new Client("Maria", "alex@gmail.com");
		
		String s1 = "teste";
		String s2 = "teste";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c1 == c2); //compara referencias
		System.out.println(s1 == s2); //tratamento especial para strings

	}

}
