package org.dimigo.interfaces;

public interface IDBManager {

	public final static String ORACLE_DATABASE = "ORACLE";
	public final static String SYBASE_DATABASE = "SYBASE";

	public void insert();

	public void search();

	public void update();

	public void delete();

	public static IDBManager getDBObject(String database) {
		if (database == null)
			return null;
		if (ORACLE_DATABASE.equals(database)) {
			return new OracleDB();
		}
		if (SYBASE_DATABASE.equals(database)) {
			return new SybaseDB();
		}
		else return null;
	}

}
