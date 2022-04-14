package com.messages;

import java.util.Scanner;

public class MessagesService {
  public static void createMessage() {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the message");
    String message = sc.nextLine();
    System.out.println("Enter the author of the message");
    String author_message = sc.nextLine();

    Messages register = new Messages();

    register.setMessage(message);
    register.setAuthor_message(author_message);

    MessagesDAO.createMessageDB(register);
  }

  public static void readMessages() {
    MessagesDAO.readMessagesDB();
  }

  public static void deleteMessage() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the id of the message");
    int id = sc.nextInt();

    MessagesDAO.deleteMessageDB(id);

  }

  public static void updateMessage() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the id of the message you want to update");
    int id = sc.nextInt();

    System.out.println("Enter the new message");
    String message = sc.nextLine();

    if(message.isEmpty()) {
      System.out.println("Enter the new message");
      message = sc.nextLine();
    }
    MessagesDAO.updateMessageDB(id, message);
  }

}
