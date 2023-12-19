package onetoonea2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonea2.dto.AadharCard;
import onetoonea2.dto.Person;

public class PersonDao {

	
	public void savePerson(Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
	public void findPerson(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person dbPerson=entityManager.find(Person.class, id);
		if(dbPerson!=null) {
//			id is present then i can update the data
			System.out.println(dbPerson);
		}else {
//			id is not present 
			System.out.println("Sorry id is not present");
		}
		
	}
	
	public void deletePerson(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person dbPerson=entityManager.find(Person.class, id);
		
		if(dbPerson!=null) {
//			id is present that person exist then i can delete the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbPerson);
			entityTransaction.commit();
			
		}else {
//			id is not present
			System.out.println("Sorry id is not present");
		}
	}

	public void updatePerson(int id, Person person) {
//		person=name,address
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person dbPerson=entityManager.find(Person.class, id);
		if(dbPerson!=null) {
//			id is present then i can update the data
			
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();	
			person.setId(id);
//			person=id name address 
			person.setAadharCard(dbPerson.getAadharCard());
//			person=id name address aadharCard
			entityManager.merge(person);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present");
		}		
	}
	
	
	
	
	
	
	
	
}
