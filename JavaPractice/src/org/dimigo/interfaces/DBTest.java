package org.dimigo.interfaces;

public class DBTest {

	public static void main(String[] args) {
		

		IDBManager s = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		IDBManager o = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		
		crud(s);
		System.out.println();
		crud(o);

	}
	
	public static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
	
}
