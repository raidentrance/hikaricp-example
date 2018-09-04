/**
 * 
 */
package com.devs4j.hikaricp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author raidentrance
 *
 */
public class Devs4jApplication {
	public static void main(String[] args) throws SQLException {
		Connection connection = Devs4jDatasource.getConnection();
		
		PreparedStatement statement = connection.prepareStatement("SELECT TABLE_NAME FROM TABLES");
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()){
			System.out.println(resultSet.getString("TABLE_NAME"));
		}
	}
}
