/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package j2se.xe.github.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the TEST_USERS table.
 */
public class TestUsersPk implements Serializable
{
	protected int userId;

	/** 
	 * This attribute represents whether the primitive attribute userId is null.
	 */
	protected boolean userIdNull;

	/** 
	 * Sets the value of userId
	 */
	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	/** 
	 * Gets the value of userId
	 */
	public int getUserId()
	{
		return userId;
	}

	/**
	 * Method 'TestUsersPk'
	 * 
	 */
	public TestUsersPk()
	{
	}

	/**
	 * Method 'TestUsersPk'
	 * 
	 * @param userId
	 */
	public TestUsersPk(final int userId)
	{
		this.userId = userId;
	}

	/** 
	 * Sets the value of userIdNull
	 */
	public void setUserIdNull(boolean userIdNull)
	{
		this.userIdNull = userIdNull;
	}

	/** 
	 * Gets the value of userIdNull
	 */
	public boolean isUserIdNull()
	{
		return userIdNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof TestUsersPk)) {
			return false;
		}
		
		final TestUsersPk _cast = (TestUsersPk) _other;
		if (userId != _cast.userId) {
			return false;
		}
		
		if (userIdNull != _cast.userIdNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + userId;
		_hashCode = 29 * _hashCode + (userIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "j2se.xe.github.dto.TestUsersPk: " );
		ret.append( "userId=" + userId );
		return ret.toString();
	}

}
