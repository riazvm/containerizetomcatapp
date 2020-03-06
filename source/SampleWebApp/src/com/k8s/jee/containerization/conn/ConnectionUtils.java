package com.k8s.jee.containerization.conn;


import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.k8s.jee.containerization.conn.MySQLConnUtils;
 
public class ConnectionUtils {
 
    public static Connection getConnection() 
              throws ClassNotFoundException, SQLException, NamingException {
 
        
        return MySQLConnUtils.getMySQLConnection();
        
    }
     
    public static void closeQuietly(Connection conn) {
        try {
            conn.close();
        } catch (Exception e) {
        }
    }
 
    public static void rollbackQuietly(Connection conn) {
        try {
            conn.rollback();
        } catch (Exception e) {
        }
    }
}