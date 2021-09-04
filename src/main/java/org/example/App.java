/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String num1 = input.nextLine();

        System.out.print("What is the second number? ");
        String num2 = input.nextLine();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int sum = n1 + n2;
        int dif = n1 - n2;
        int pro = n1 * n2;
        int quo = n1 / n2;

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", n1, n2, sum, n1, n2, dif, n1, n2, pro, n1, n2, quo);
    }
}
