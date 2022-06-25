package OneToOne;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import OneToOne.Entities.Instructor;
import OneToOne.Entities.InstructorDetail;

public class MainApp {
	public static void main(String[] args) throws SQLException {
		SessionFactory sf= new 	Configuration().configure().addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class).buildSessionFactory();
		
		Session sess=sf.getCurrentSession();
		sess.beginTransaction();
		Instructor instructor=new Instructor("rajan", "sonvane", "rajasonvane17.rs@gmail.com");
		InstructorDetail instructorDetail=new InstructorDetail("rajanyt", "coding");
		instructor.setInstructorDetail(instructorDetail);
		sess.save(instructor);
		System.out.println("persisted!!");
		sess.getTransaction().commit();
	}
}
