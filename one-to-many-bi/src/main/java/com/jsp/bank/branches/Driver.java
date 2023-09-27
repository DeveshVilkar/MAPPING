package com.jsp.bank.branches;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("deva");
        
		EntityManager entityManager=entityManagerFactory.createEntityManager();
        
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Bank bank=new Bank();
		bank.setName("ICICI");
		
		Branch branch=new Branch();
		branch.setLocation("MUMBAI CENTRAL");
		
		Branch branch1=new Branch();
		branch1.setLocation("WORLI");
		
		Branch branch2=new Branch();
		branch2.setLocation("PANVEL");
		
		ArrayList<Branch> branchs=new ArrayList<Branch>();
		branchs.add(branch2);
		branchs.add(branch1);
		branchs.add(branch);
		
		branch.setBank(bank);
		branch1.setBank(bank);
		branch2.setBank(bank);
		
		bank.setBranchs(branchs);
		
		entityTransaction.begin();
		entityManager.persist(bank);
		entityManager.persist(branch);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityTransaction.commit();
		

	}

}
