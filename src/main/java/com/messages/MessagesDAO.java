package com.messages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessagesDAO {
  public static void createMessageDB(Messages message) {
    ConnectionDB dbConnect = new ConnectionDB();

    try (Connection conn = dbConnect.get_connection()) {

      PreparedStatement ps = null;

      try {
        String query = "INSERT INTO messages (message, author_message) VALUES (?, ?)";

        ps = conn.prepareStatement(query);
        ps.setString(1, message.getMessage());
        ps.setString(2, message.getAuthor_message());
        ps.executeUpdate();
        System.out.println("Message created");

      } catch (SQLException ex) {
        System.out.println("Error: " + ex);
      }
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }

  public static void readMessagesDB() {
    ConnectionDB dbConnect = new ConnectionDB();

    try (Connection conn = dbConnect.get_connection()) {

      PreparedStatement ps = null;
      ResultSet res = null;

      try {
        String query = "SELECT * FROM messages";
        ps = conn.prepareStatement(query);
        res = ps.executeQuery();

        while (res.next()) {
          System.out.println("");
          System.out.println("ID: " + res.getInt("id"));
          System.out.println("Message: " + res.getString("message"));
          System.out.println("Author: " + res.getString("author_message"));
          System.out.println("Created at: " + res.getString("created_at"));
          System.out.println("---------------------------------");
        }

      } catch (SQLException ex) {
        System.out.println("Error: " + ex);
      }
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }

  public static void readMessageDB(int id) {
    ConnectionDB dbConnect = new ConnectionDB();

    try (Connection conn = dbConnect.get_connection()) {

      PreparedStatement ps = null;
      ResultSet res = null;

      try {
        String query = "SELECT * FROM messages WHERE id = ?";

        ps = conn.prepareStatement(query);
        ps.setInt(1, id);

        res = ps.executeQuery();

        System.out.println("");
        System.out.println("ID: " + res.getInt("id"));
        System.out.println("Message: " + res.getString("message"));
        System.out.println("Author: " + res.getString("author_message"));
        System.out.println("Created at: " + res.getString("created_at"));
        System.out.println("---------------------------------");

      } catch (SQLException ex) {
        System.out.println("Error: " + ex);
      }
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }

  public static void updateMessageDB(Messages message) {
    ConnectionDB dbConnect = new ConnectionDB();

    try (Connection conn = dbConnect.get_connection()) {
      PreparedStatement ps = null;
      try {
        String query = "UPDATE messages SET message = ? WHERE id = ?";

        ps = conn.prepareStatement(query);
        ps.setString(1, message.getMessage());
        ps.setInt(2, message.getId());

        ps.executeUpdate();

        System.out.println("Message updated");
        MessagesDAO.readMessageDB(message.getId());

      } catch (SQLException ex) {
        System.out.println("Error: " + ex);
      }
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }

  public static void deleteMessageDB(int id) {
    ConnectionDB dbConnect = new ConnectionDB();

    try (Connection conn = dbConnect.get_connection()) {
      PreparedStatement ps = null;
      try {
        String query = "DELETE FROM messages WHERE id = ?";

        ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Message deleted");

      } catch (SQLException ex) {
        System.out.println("Error: " + ex);
      }

    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }

}
