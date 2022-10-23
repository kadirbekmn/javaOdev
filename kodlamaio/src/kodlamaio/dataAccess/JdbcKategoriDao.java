package kodlamaio.dataAccess;

import kodlamaio.entities.Kategori;

public class JdbcKategoriDao implements KategoriDao{

	@Override
	public void add(Kategori kategori) {
		
		System.out.println("Jdbc ile veritabanına eklendi");
		
	}

}
