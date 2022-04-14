package com.messages;

import java.sql.Connection;

public class Main {
  public static void main(String[] args){
    ConnectionDB connectionDB = new ConnectionDB();
    try(Connection cnx = connectionDB.get_connection()){
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
