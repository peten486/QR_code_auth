package org.peten.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://doyouknowpeten.xyz:2937/QCAU";
	private static final String USER = "peten";
	private static final String PW = "exx1s3pa@";
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
			System.out.println("test Success");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
