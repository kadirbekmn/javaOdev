package kodlamaio.dataAccess;

import kodlamaio.entities.Kategori;

public class HibernateKategoriDao implements KategoriDao{

	@Override
	public void add(Kategori kategori) {

		System.out.println("Hibernate ile veritabanına eklendi");

		
	}

}
