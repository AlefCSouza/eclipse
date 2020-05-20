package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaConexao {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("ContabilPU");
		
		EntityManager sessao = fabrica.createEntityManager();
		sessao.close();
		fabrica.close();
		
	}

}
