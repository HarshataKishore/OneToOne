package org.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {

	public static void main(String[] args) {

		Passport p = new Passport();
		p.setFname("Harshata Kishore");
		p.setCountry("India");
		Person ps = new Person();
		ps.setName("Harshata");
		ps.setAddr("Vijayawada");
	    ps.setPs(p);
		
		Configuration con = new Configuration();
		con.configure();
		
		SessionFactory sef = con.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction tr = ses.beginTransaction();
		ses.save(p);
		ses.save(ps);
		tr.commit();
		ses.close();
	}

}
