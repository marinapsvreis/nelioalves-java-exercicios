package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		// conexao com o banco de dados
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		// adicionando pessoas ao bd
		// Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		// Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		// Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

		// realizando transaction para add pessoas
		// em.getTransaction().begin();

		// em.persist(p1);
		// em.persist(p2);
		// em.persist(p3);

		// em.getTransaction().commit();
		
		//busca pessoa pelo id
		//Pessoa p = em.find(Pessoa.class, 2);		
		//System.out.println(p);

		//apagar pessoa do bd
//		Pessoa p = em.find(Pessoa.class, 1);
//		
//		em.getTransaction().begin();
//		
//		em.remove(p);	
//		
//		em.getTransaction().commit();
		
		//atualizar registro
//		Pessoa p = em.find(Pessoa.class, 2);
//		em.getTransaction().begin();
//		p.setEmail("joaquimtorres@gmail.com");
//		em.getTransaction().commit();
//		
		//fechando tudo		
		
		System.out.println("Pronto!");
		em.close();
		emf.close();

	}

}
