package com.bitcamp.op.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() throws SQLException {

		String jdbcUrl = "jdbc:mysql:database-1.ckj7b1cenola.ap-northeast-2.rds.amazonaws.com/project?serverTimezone=UTC";
		String user = "bit";
		String pw = "bit";

		return DriverManager.getConnection(jdbcUrl, user, pw);
	}

}
