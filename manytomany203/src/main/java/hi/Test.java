package hi;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//to add
		
//		Course c1=new Course();
//		c1.setcId(1);
//		c1.setcName("biology");
//		c1.setcCost(500);
//		
//		Course c2=new Course();
//		c2.setcId(2);
//		c2.setcName("physics");
//		c2.setcCost(200);
//	
//		List<Course> courses=new ArrayList();
//		courses.add(c1);
//		courses.add(c2);
//		
//		Student s=new Student();
//		s.setsName("maga");
//		s.setsAge(45);
//		s.setCourses(courses);
//		
//		
//		
//		et.begin();
//		em.merge(s);
//		em.merge(c2);
//		em.merge(c1);
//		et.commit();
//		
//		 
		
		// to get 
		
		
//		Student s=em.find(Student.class, 1);
//		System.out.println(s);
		
		
		
		//update
//		et.begin();
//		Student s=em.find(Student.class, 2);
//		s.setsName("thimma kd");
//		s.setsAge(25);
//		et.commit();
		
		
		
		//delete
		et.begin();
		Student s=em.find(Student.class, 2);
		em.remove(s);
		et.commit();
		
		
		
		
		
		
		
	}

}
