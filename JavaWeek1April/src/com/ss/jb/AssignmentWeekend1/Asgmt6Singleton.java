package com.ss.jb.AssignmentWeekend1;
package com.ss.jb.AssignmentWeekend1;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Asgmt6Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleSingleton ss = SampleSingleton.getInstance();
		SampleSingleton.databaseQuery(new BigDecimal(1234));
	}

	public static class SampleSingleton {

		private static Connection conn = null;
		
		private static SampleSingleton instance = null;
		
		public static SampleSingleton getInstance() {
			if (instance == null)
				instance = new SampleSingleton(); //initialize the singleton the first time it's requested
			return instance;
		}
		
		public static void databaseQuery(BigDecimal input) {
			if (conn == null)
				conn = DriverManager.getConnection("url of database"); // initialize Connection only once (?)
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id from table");
			int x = 0;
			while(rs.next()) {
				x = rs.getInt(1) * input;
			}
		}
	}
}
