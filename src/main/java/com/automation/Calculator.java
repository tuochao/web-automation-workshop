package com.automation;

import java.lang.String;

public class Calculator{

    public int add(int a, int b){
        return a + b ;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator() ;
        int result = calculator.add(1,2) ;
        System.out.println(String.valueOf(result));
        System.out.println(args[0]);
    }
}

