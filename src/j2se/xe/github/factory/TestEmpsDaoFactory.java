/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package j2se.xe.github.factory;

import java.sql.Connection;
import j2se.xe.github.dao.*;
import j2se.xe.github.jdbc.*;

public class TestEmpsDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return TestEmpsDao
	 */
	public static TestEmpsDao create()
	{
		return new TestEmpsDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return TestEmpsDao
	 */
	public static TestEmpsDao create(Connection conn)
	{
		return new TestEmpsDaoImpl( conn );
	}

}
