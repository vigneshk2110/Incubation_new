package trails;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MedicineApp {

	public static void main(String[] args) {
		Medicine m1 = new Medicine(1, "Para", 1250, 2);
		Medicine m2 = new Medicine(2, "Amox", 1000, 20);
		Medicine m3 = new Medicine(3, "digine", 12500, 12);
		Medicine m4 = new Medicine(4, "1tab4", 125, 25);
		Medicine m5 = new Medicine(5, "1tab5", 100, 200);
		Medicine m11 = new Medicine(11, "2Tab1", 1250, 2);
		Medicine m12 = new Medicine(12, "2Tab2", 1000, 20);
		Medicine m13 = new Medicine(13, "2Tab3", 12500, 12);
		Medicine m14 = new Medicine(14, "2Tab4", 125, 25);
		Medicine m15 = new Medicine(15, "2Tab5", 100, 200);

		ArrayList<Medicine> mediList1 = new ArrayList<Medicine>();
		mediList1.add(m5);
		mediList1.add(m4);
		mediList1.add(m3);
		mediList1.add(m2);
		mediList1.add(m1);
		mediList1.add(m15);
		mediList1.add(m14);
		mediList1.add(m13);
		mediList1.add(m12);
		mediList1.add(m11);
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Medicine.class);
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		for (Medicine med : mediList1) {
			session.persist(med);
		}
		
		tx.commit();	

	}

}
