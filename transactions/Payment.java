package com.flysaa.transactions;


public class Payment {

private double cost;

private double amountTendered;

private double change;

public void setCost(double cost){
this.cost = cost;
}
public double getCost(){
return cost;
}
public void setAmountTendered(double amountTendered){
this.amountTendered = amountTendered;
}
public double getAmountTendered(){
return amountTendered;
}
public void setChange(double change){
this.change = change;
}
public double getChange(){
return change;
}
public Payment () {
}

public double cashPayment (double cost, double amountTendered, double change){

this.cost = cost;
this.amountTendered = amountTendered;
this.change = amountTendered - cost;
return this.change;

}

public void display () {

System.out.println (" AmountTendered = " + amountTendered);

System.out.println (" Cost = " + cost);

System.out.println (" change = " + change);

}


}

