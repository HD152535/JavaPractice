package org.dimigo.interfaces;

public class DBTest {

	public static void main(String[] args) {
		

		IDBManager s = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		IDBManager o = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		
		
		System.out.println("<< 변경 전  >>");
		crud(s);
		System.out.println();
		System.out.println("<< 변경 후  >>");
		crud(o);

	}
	
	public static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
	
}
