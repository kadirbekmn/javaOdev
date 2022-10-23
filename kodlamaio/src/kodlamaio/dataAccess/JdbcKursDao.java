package kodlamaio.dataAccess;

import kodlamaio.entities.Kurs;

public class JdbcKursDao implements KursDao{

	@Override
	public void add(Kurs kurs) {
		System.out.println("Jdbc ile veritabanına eklendi");
		
	}

}
