package com.flysaa.transactions;

import java.util.Scanner;


public class Ticket{

private int ticketNumber;

private String ticketClass;

private String departureDate;

private String arrivalDate;

private String departureTime;

private String arrivalTime;

private String departureAirport;

private String arrivalAirport;

public Ticket () {
}

public Ticket (int ticketNumber,String ticketClass,String DepartureDate,String arrivalDate,String departureTime,String arrivalTime,String departureAirport, String arrivalAirport){ 


public void setTicketNumber(int ticketNumber){
this.ticketNumber = ticketNumber;
}
public int getTicketNumber(){
return ticketNumber;
}
public void setTicketClass(String ticketNumber){
this.ticketClass = ticketClass;
}
public String getTicketClass(){
return ticketClass;
}
public void setDepartureDate(String departureDate){
this.departureDate = departureDate;
}
public String getDepartureDate(){
return departureDate;
}
public void setArrivalDate(String arrivalDate){
this.arrivalDate = arrivalDate;
}
public String getArrivalDate(){
return arrivalDate;
}
public void setDepartureTime(String departureTime){
this.departureTime = departureTime;
}
public String getDepartureTime(){
return departureTime;
}

public void setArrivalTime(String arrivalTime){
this.arrivalTime = arrivalTime;
}
public String getArrivalTime(){
return arrivalTime;
}
public void setDepartureAirport(String departureAirport){
this.departureAirport = departureAirport;
}
public String getDepartureAiport(){
return departureAirport;
}
/*public void setDepartureAirport(String departureAirport){ 
this.departureAirport = departureAirport;
}
public String getDepartureAirport(){
return departureAirport;
}
*/
public void setArrivalAirport(String arrivalAirport){
this.arrivalAirport = arrivalAirport;
}
public String getArrivalAirport (){
return arrivalAirport;
}

public Ticket () {
}

public void Ticket (int ticketNumber,String ticketClass,String departureDate,String arrivalDate,String arrivalTime,String departureAirport,String arrivalAirport) {

this.ticketNumber = ticketNumber;
this.ticketClass = ticketClass;
this.departureDate = departureDate;
this.arrivalDate = arrivalDate;
this.departureDate = departureTime;
this.arrivalTime = arrivalTime;
this.departureAirport = departureAirport;
this.arrivalAirport = arrivalAirport;

}

public void display () {

Scanner scanner = new Scanner(System.in);


System.out.println ("****************************AIRLINE TICKET***************************");

System.out.println ("                         Address: 12 Cold street,pretoria South Africa");
System.out.println ("                        Phone Number: 0610179866" );
System.out.println ("                        E - Mail: segunabdul@hotmaail.com " );

System.out.println("ticketNumber = " + ticketNumber );
System.out.println("ticketClass = " + ticketClass);
System.out.println("departureDate = " + departureDate);
System.out.println("arrivalDate = " + arrivalDate);
System.out.println("departureTime = " + departureTime);
System.out.println("arrivalTime = " + arrivalTime);
System.out.println("departureAirport = " + departureAirport);
System.out.println("arrivalAirport = " +arrivalAirport);

}

}
