package kodlamaio.dataAccess;

import kodlamaio.entities.Egitmen;

public class HibernateEgitmenDao implements EgitmenDao{
	
	public void add(Egitmen egitmen) {
		System.out.println("Hibernate ile veritabanına eklendi");
	}

}
