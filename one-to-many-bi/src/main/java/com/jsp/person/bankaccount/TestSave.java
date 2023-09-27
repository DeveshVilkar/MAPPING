package com.jsp.person.bankaccount;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("deva");
        
		EntityManager entityManager=entityManagerFactory.createEntityManager();
        
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person =new Person();
		person.setName("kedar");
		
		BankAccount bankAccount=new BankAccount();
		bankAccount.setBankname("bank of america");
		
		BankAccount bankAccount1=new BankAccount();
		bankAccount1.setBankname("boi");
		
		BankAccount bankAccount2=new BankAccount();
		bankAccount2.setBankname("maharasta bank");
		
		ArrayList<BankAccount> bankAccounts=new ArrayList<BankAccount>();
		bankAccounts.add(bankAccount2);
		bankAccounts.add(bankAccount);
		bankAccounts.add(bankAccount1);
		
		bankAccount.setPerson(person);
		bankAccount1.setPerson(person);
		bankAccount2.setPerson(person);
		
		
		person.setBankAccount(bankAccounts);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(bankAccount);
		entityManager.persist(bankAccount1);
		entityManager.persist(bankAccount2);
		entityTransaction.commit();
		
		

	}

}

