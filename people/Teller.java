package com.flysaa.people;

//import com.flysaa.transactions.Ticket;

//import com.flysaa.transactions.Payment;

import java.util.Scanner;

public class Teller{

private int tellerNumber;

private int tellerId;

private String tellerName;

public void setTellerNumber(int tellerNumber){
this.tellerNumber = tellerNumber;
}
public int getTellerNumber(){
return tellerNumber;
}
public void setTellerId(int tellerId){
this.tellerId = tellerId;
}
public int getTellerId(){
return tellerId;
}
public void setTellerName(String tellerName){
this.tellerName = tellerName;
}
public String getTellerName(){
return tellerName;
}

public void ticketIssue( int tellerNumber,int tellerId,String tellerName){

this.tellerNumber = tellerNumber;
this.tellerId = tellerId;
this.tellerName = tellerName;
}

/*public void display () {

System.out.println("tellerNumber = " + tellerNumber);
System.out.println("tellerId = " + tellerId);
System.out.println("tellerName = " + tellerName);
}
*/
}