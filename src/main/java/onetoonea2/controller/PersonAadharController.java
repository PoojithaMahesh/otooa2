package onetoonea2.controller;

import javax.persistence.EntityManagerFactory;

import onetoonea2.dao.AadharCardDao;
import onetoonea2.dao.PersonDao;
import onetoonea2.dto.AadharCard;
import onetoonea2.dto.Person;

public class PersonAadharController {
public static void main(String[] args) {
	
Person person =new Person();
person.setId(10);
person.setName("gauri");
person.setAddress("Amarwati");

AadharCard aadharCard=new AadharCard();
aadharCard.setId(1);
aadharCard.setName("vinod");
aadharCard.setAge(19);


person.setAadharCard(aadharCard);

PersonDao personDao=new PersonDao();
personDao.deletePerson(10);









}

}
