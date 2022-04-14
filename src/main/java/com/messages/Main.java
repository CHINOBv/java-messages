package com.messages;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int option = 0;

    do{
      System.out.println("------------------------------------------------------");
      System.out.println("1. Create Message");
      System.out.println("2. Read Messages");
      System.out.println("3. Update Message");
      System.out.println("4. Delete Message");
      System.out.println("5. Exit");
      System.out.println("------------------------------------------------------");
      option = sc.nextInt();

      switch(option) {
        case 1:
          MessagesService.createMessage();
          break;
        case 2:
          MessagesService.readMessages();
          break;
        case 3:
          MessagesService.updateMessage();
          break;
        case 4:
          MessagesService.deleteMessage();
          break;
        case 5:
          System.out.println("Exit");
          break;
        default:
          System.out.println("Invalid option");
      }
    }while(option != 5);
  }
}
