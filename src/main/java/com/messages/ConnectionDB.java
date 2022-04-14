package com.messages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
  public Connection get_connection() {
    Connection connection = null;
    try{
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messages_app", "root", "password");
    } catch (SQLException e) {
      System.out.println("Connection failed" + e);
    }
    return connection;
  }
}