package kodlamaio.dataAccess;

import kodlamaio.entities.Kurs;

public class HibernateKursDao implements KursDao{

	@Override
	public void add(Kurs kurs) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

}
