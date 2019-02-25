package com.formafast.dao;

import com.formafast.entities.Test;

public class Testons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonneDaoImpl personneDao = new PersonneDaoImpl();// instanciation de la classe

		/*
		 * Add method Test t = new Test(5, "Ben", "Geoges", "+216 456 458",
		 * "dedef"); Test t1 = new Test(6, "issa", "tiro", "+216 556 458",
		 * "dedef@gmail"); Test t2 = new Test(7, "meril", "naco",
		 * "+216 956 458", "gedef"); personneDao.ajouter(t1);
		 * personneDao.ajouter(t2); personneDao.ajouter(t);
		 */
		/*Update method
		 * Test t = new Test(); t.setId(1); t.setNom("Blaise");
		 * t.setPrenom("Blaise"); t.setEmail("edjommebla@gmail.com");
		 * personneDao.modifier(t);
		 */
		
		Test t = new Test();
		t.setId(6);
		personneDao.supprimer(t);
		
	}

}
