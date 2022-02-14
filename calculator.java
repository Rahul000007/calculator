package com.main;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char operator;
        double number1, number2, result;
        System.out.println("Enter the operator +, -, *, /");
        operator=scanner.next().charAt(0);
        System.out.println("Enter first number ");
        number1= scanner.nextDouble();
        System.out.println("Enter seconde number");
        number2=scanner.nextDouble();
        switch (operator){
            case '+':
                result= number1+ number2;
                System.out.println( number1 + " + " + number2 + " = " +result);
                break;
            case '-':
                result= number1- number2;
                System.out.println( number1 + " - " + number2 + " = " +result);
                break;
            case '*':
                result= number1 * number2;
                System.out.println( number1 + " * " + number2 + " = " +result);
                break;
            case '/':
                result= number1 /  number2;
                System.out.println( number1 + " / " + number2 + " = " +result);
                break;
            default:
                System.out.println("unknow operator");
                break;
        }
    }
}
