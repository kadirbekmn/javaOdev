package kodlamaio;

import kodlamaio.core.logging.Logger;
import kodlamaio.core.logging.MailLogger;
import kodlamaio.business.EgitmenManager;
import kodlamaio.business.KategoriManager;
import kodlamaio.business.KursManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.dataAccess.HibernateEgitmenDao;
import kodlamaio.dataAccess.HibernateKursDao;
import kodlamaio.dataAccess.JdbcEgitmenDao;
import kodlamaio.dataAccess.JdbcKategoriDao;
import kodlamaio.dataAccess.JdbcKursDao;
import kodlamaio.entities.Egitmen;
import kodlamaio.entities.Kategori;
import kodlamaio.entities.Kurs;

public class Main {

	public static void main(String[] args) throws Exception {

		Egitmen egitmen1 = new Egitmen(123, "Kadir", "Java Dersi", 65);

		Logger[] loggers1 = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		EgitmenManager egitmenManager = new EgitmenManager(new HibernateEgitmenDao(), loggers1);
		egitmenManager.add(egitmen1);

		Kurs kurs1 = new Kurs(1, "Java", 10);
		Kurs kurs2 = new Kurs(1, "C#", 10);
		Kurs kurs3 = new Kurs(1, "Phyton", 10);

		Kurs[] kurslar = { kurs1, kurs2 };

		KursManager kursManager = new KursManager(loggers1, new HibernateKursDao(), kurslar);
		kursManager.add(kurs3);

		Logger[] loggers2 = { new MailLogger() };

		
		Kategori kategori1 = new Kategori(5, "Yetişkin");
		Kategori kategori2 = new Kategori(5, "Çocuk");

		Kategori[] kategoriler = { kategori1 };

		KategoriManager kategoriManager = new KategoriManager(new JdbcKategoriDao(), loggers2, kategoriler);
		kategoriManager.add(kategori2);

	}
}
