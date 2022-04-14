package com.messages;

import java.util.Scanner;

public class MessagesService {
  public static void createMessage(){

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

  public static void readMessages(){

  }

  public static void deleteMessage(int id){

  }

  public static void updateMessage(int id, String message){

  }

}
