package com.messages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessagesDAO {
  public static void createMessageDB (Messages message){
    ConnectionDB dbConnect = new ConnectionDB();
    try(Connection conn = dbConnect.get_connection()){
      PreparedStatement ps = null;
      try{
        String query = "INSERT INTO messages (message, author_message) VALUES (?, ?)";

        ps = conn.prepareStatement(query);
        ps.setString(1, message.getMessage());
        ps.setString(2, message.getAuthor_message());
        ps.executeUpdate();
        System.out.println("Message created");

      }catch(SQLException ex){
        System.out.println("Error: " + ex);
      }
    }catch(Exception e){
      System.out.println("Error: " + e);
    }
  }

  public static void readMessagesDB (Messages message){

  }

  public static void deleteMessageDB(int id){

  }

  public static void updateMessageDB(int id, String message){

  }

}
