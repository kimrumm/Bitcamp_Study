// @ 작성일 : 2021. 7. 28.
// 10. close 기능

package guest.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	public static void close(Connection conn) {
		if (conn != null) {
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(Statement stmt) { // pstmt를 쓰는것과 같다.
		if (stmt != null) {
		}
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(ResultSet rs) { // 
		if (rs != null) {
		}
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	public static void rollback(Connection conn) {
		
		if(conn != null ) {
			try {
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}