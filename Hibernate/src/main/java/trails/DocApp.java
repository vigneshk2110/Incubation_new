package trails;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class DocApp {

	public static void main(String[] args) {

		Doctor d1 = new Doctor(1, "Vignesh");
		Doctor d2 = new Doctor(2, "Gokul");
		Doctor d3 = new Doctor(3, "Amudhan");
		Doctor d4 = new Doctor(4, "Rajesh");
		Doctor d5 = new Doctor(5, "Surya");
		Doctor d6 = new Doctor(6, "Amuthan");
		Doctor d7 = new Doctor(7, "Sneha");
		Doctor d8 = new Doctor(8, "Nibila");
		Doctor d9 = new Doctor(9, "Vijayan");
		Doctor d10 = new Doctor(10, "Jagadeesh");

		ArrayList<Doctor> docList = new ArrayList<Doctor>();

		docList.add(d1);
		docList.add(d2);
		docList.add(d3);
		docList.add(d4);
		docList.add(d5);
		docList.add(d6);
		docList.add(d7);
		docList.add(d8);
		docList.add(d9);
		docList.add(d10);

		Configuration config = new Configuration().configure().addAnnotatedClass(Doctor.class);
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		for (Doctor doctor : docList) {
			session.persist(doctor);
		}
		
		tx.commit();	
	}

}
