package onetoonea2.controller;

import onetoonea2.dao.AadharCardDao;
import onetoonea2.dao.PersonDao;
import onetoonea2.dto.AadharCard;
import onetoonea2.dto.Person;

public class PersonAadharController {
public static void main(String[] args) {
	
//	Person person=new Person();
//	person.setId(1);
//	person.setName("jay");
//	person.setAddress("Chennai");
//	
//	
//	PersonDao personDao=new PersonDao();
//	personDao.savePerson(person);
	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(100);
//	aadharCard.setName("jaykumar");
//	aadharCard.setAge(19);
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.saveAadharCard(1, aadharCard);
	
	
//	FIND
//	PersonDao personDao=new PersonDao();
//	personDao.findPerson(1);
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.findAadharCard(100);
	
//	DELETE
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.deleteAdharCard(100);
	
//	PersonDao personDao=new PersonDao();
//	personDao.deletePerson(1);
	
	
	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setName("jay");
//	aadharCard.setAge(21);
//
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.updateAadharCard(100, aadharCard);
//	
//	
//	
	
	
	
	
	
	
	
	
	
	Person person=new Person();
	person.setName("jay");
	person.setAddress("Bangalore");
	
	
	PersonDao personDao=new PersonDao();
	personDao.updatePerson(1,person);
	
	
	
	
}

}
