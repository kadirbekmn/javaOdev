package kodlamaio.dataAccess;

import kodlamaio.entities.Egitmen;

public class JdbcEgitmenDao implements EgitmenDao{

	public void add(Egitmen egitmen) {
		System.out.println("JDBC ile veritabanına eklendi");
	}

}
	

