package com.peten.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class MySQLConnectionTest {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://peten.xyz:2937/PWAS?autoReconnect=true&useSSL=false&serverTimezone=Asia/Seoul";
	private static final String USER = "";
	private static final String PW = "";
	
	
	@Before
	public void beforeClass() {
		System.out.println("-----테스트 시작-----");
	}
	
	@After
	public void afterClass() {
		System.out.println("-----테스트 종료-----");
	}
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		
		try( Connection conn = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(conn);
		} catch( Exception e ) {
			e.printStackTrace();
		}
	}
}
