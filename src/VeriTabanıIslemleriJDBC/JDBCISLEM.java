package VeriTabanıIslemleriJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCISLEM {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url ="jdbc:sqlserver://Ramazan;databaseName=APARTMAN;integratedSecurity=true;trustServerCertificate=True";
		Connection c =null;
		Statement st=null;	
		ResultSet rs=null;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		c=DriverManager.getConnection(url);
		System.out.println("Bağlantı Başarılı");
		}
}
