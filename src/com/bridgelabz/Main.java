package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
	try{
        //Expression and Condition
        //Code that generate exception
        int divid=100/0;

    }
    catch(ArithmeticException e){

        System.out.println("This is Arithmatic Exception"+e.getMessage());
    }
    }
}
