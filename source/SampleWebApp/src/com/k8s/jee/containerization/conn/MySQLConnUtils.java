package com.k8s.jee.containerization.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

  
public class MySQLConnUtils {
  
  
 public static Connection getMySQLConnection() throws SQLException,
         ClassNotFoundException, NamingException {
	 
	 	Context initContext = new InitialContext();
	 	Context envContext  = (Context)initContext.lookup("java:/comp/env");
	 	DataSource ds = (DataSource)envContext.lookup("jdbc/sampledb");
	 	Connection conn = ds.getConnection();
	 	

     return conn;
 }
}

