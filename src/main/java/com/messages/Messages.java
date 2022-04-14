package com.messages;

public class Messages {
  int id;
  String message;
  String author_message;
  String created_at;

  public Messages(){}

  public Messages(String message, String author_message, String created_at) {
    this.message = message;
    this.author_message = author_message;
    this.created_at = created_at;
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public String getAuthor_message() {
    return author_message;
  }
  public void setAuthor_message(String author_message) {
    this.author_message = author_message;
  }
  public String getCreated_at() {
    return created_at;
  }
  public void setCreated_at(String created_at) {
    this.created_at = created_at;
  }

}
