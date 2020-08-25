package com.flysaa.people;

import com.flysaa.transactions.Payment;

import com.flysaa.transactions.Ticket;

import java.util.Scanner;

public class Customer{

private int age;

private String firstName;

private String SurName;


public void setAge(int age){
this.age = age;
}
public int getAge(){
return age;
}
public void setFirstName(String firstName){
this.firstName = firstName;
}
public String getFirstName(){
return firstName;
}
public void setSurname(String SurName){
this.SurName = SurName;
}
public String getSurName(){
return SurName;

public Customer (){
}

public void ticketPurchase(int age,String firstName,String SurName,Payment payment,Ticket ticket){

this.age = age;
this.firstName = firstName;
this.SurName = SurName;

}

public void display() {
System.out.println ("firstName = " + firstName);
System.out.println("SurName = " + SurName);
System.out.println("age = " + age);

}
}// End of class

