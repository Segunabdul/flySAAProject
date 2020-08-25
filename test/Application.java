package com.flysaa.test;

import com.flysaa.transactions.Payment;

import com.flysaa.transactions.Ticket;

import com.flysaa.people.Customer;

import com.flysaa.people.Teller;

public class Application{

public static void main(String [] args){

Teller teller = new Teller();

teller.setAge(20);

System.out.println(teller.getAge());

//teller.ticketIssue(20,"Segun","Abdul");


//teller.display();




Customer customer = new Customer();

Payment payment = new Payment();

Ticket ticket = new Ticket();

customer.ticketPurchase(20,"Java","Programmer",payment, ticket);

customer.display();















}

}