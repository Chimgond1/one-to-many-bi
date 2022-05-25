package com.ty.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospitalBranch {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hospital hospital=new Hospital();
		hospital.setName("apola hospital");
		hospital.setGstNumber("12fg");
		hospital.setWebsite("www.apola hospital.com");
		
		Branch branch1=new Branch();
		branch1.setName("apola rajaji nagar");
		branch1.setAdress("rajaji nagar 5th block");
		branch1.setPhone(1122333);
		
		Branch branch2=new Branch();
		branch2.setName("apola rajaji nagar");
		branch2.setAdress("rajaji nagar 6th block");
		branch2.setPhone(1122333);
		
		
		Branch branch3=new Branch();
		branch3.setName("apola rajaji nagar");
		branch3.setAdress("rajaji nagar 4th block");
		branch3.setPhone(1122333);
		
		branch1.setHospital(hospital);;
		branch2.setHospital(hospital);;
		branch3.setHospital(hospital);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		
		
		entityTransaction.commit();

	}

}
