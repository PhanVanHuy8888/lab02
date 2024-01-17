package phanvanhuy.vn.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getMySQLConnection() throws SQLException {
		String driverName = "com.mysql.cj.jdbc.Driver";
        String jdbcUrl = "jdbc:mysql://localhost:3306/customer";
        String user = "root";
        String pass = "123456";
        Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
        return myConn;
	   }

	
}
