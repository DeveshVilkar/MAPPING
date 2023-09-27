package com.jsp.person.account;

import java.util.ArrayList;

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
		person.setName("n");
		person.setEmail("n@mail.com");
		
		BankAcount bankAcount=new BankAcount();
		bankAcount.setAccount_no(1235);
		bankAcount.setBank_name("hdfc");
		bankAcount.setIfsc_code(23455);
		
		BankAcount bankAcount1=new BankAcount();
		bankAcount1.setAccount_no(124);
		bankAcount1.setBank_name("icici");
		bankAcount1.setIfsc_code(23455343);
		
		BankAcount bankAcount2=new BankAcount();
		bankAcount2.setAccount_no(52434);
		bankAcount2.setBank_name("canara");
		bankAcount2.setIfsc_code(34321l);
		
		ArrayList<BankAcount> bankAcounts=new ArrayList<BankAcount>();
		bankAcounts.add(bankAcount2);
		bankAcounts.add(bankAcount1);
		bankAcounts.add(bankAcount);
		
		person.setBankAcount(bankAcounts);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(bankAcount);
		entityManager.persist(bankAcount1);
		entityManager.persist(bankAcount2);
		entityTransaction.commit();
		

	}

}
