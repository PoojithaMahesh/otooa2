package onetoonea2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonea2.dto.AadharCard;
import onetoonea2.dto.Person;

public class AadharCardDao {

	
	public void saveAadharCard(int personId,AadharCard aadharCard) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person dbPerson=entityManager.find(Person.class, personId);
		if(dbPerson!=null) {
//			person exist
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(aadharCard);
			dbPerson.setAadharCard(aadharCard);
			entityTransaction.commit();
		}else {
//			person doesnot exist
			System.out.println("Sorry id is not present");
		}
	}
	
	public void findAadharCard(int id) {
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		
		if(dbAadharCard!=null) {
//			id is present
			System.out.println(dbAadharCard);
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	
	
	public void deleteAdharCard(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			id is present then i can delete the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbAadharCard);
			entityTransaction.commit();
			
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	
	public void updateAadharCard(int id,AadharCard aadharCard) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			id is present then i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			aadharCard.setId(id);
			entityManager.merge(aadharCard);
			entityTransaction.commit();
			
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
