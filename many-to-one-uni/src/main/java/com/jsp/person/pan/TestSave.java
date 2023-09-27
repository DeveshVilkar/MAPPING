package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;




public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("deva");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("d");
		person.setEmail("d@mail.com");
		
		Account account=new Account();
		account.setAccount_number(1234556);
		
		account.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(account);
		entityTransaction.commit();
		
	}

}
