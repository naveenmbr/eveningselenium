package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fetch_db {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String un = "root";
		String pwd = "root";
		String url = "jdbc:mysql://localhost:3306/test";
		
		Connection con = DriverManager.getConnection(url, un, pwd);
		           Statement stat = con.createStatement();
		         ResultSet result = stat.executeQuery("select * from data");
		         while (result.next()) {
					String un1 = result.getNString(1);
					String pwd1 = result.getNString(2);
					System.out.println(un1+" "+pwd1);
					
				}

	}

}
