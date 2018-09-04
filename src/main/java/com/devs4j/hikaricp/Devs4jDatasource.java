/**
 * 
 */
package com.devs4j.hikaricp;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @author raidentrance
 *
 */
public class Devs4jDatasource {

	private static final HikariConfig config;
	private static final HikariDataSource ds;

	static {
		config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/information_schema");
		config.setUsername("root");
		config.setPassword("root");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		ds = new HikariDataSource(config);
	}

	private Devs4jDatasource() {
	}

	public static final Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
}
