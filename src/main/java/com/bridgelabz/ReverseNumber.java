package com.bridgelabz;

import java.util.Scanner;
/*
 * @author: Nikhil Deshmukh
 *  Program for reverse numbers
 * We need to calculate the remainder of the number using the modulo
 * After that, we need to multiply the variable reverse by 10 and add the remainder into
 * We then divide the number by 10 and repeat steps until the number becomes 0.
 * */
public class ReverseNumber {
    public void reverseNum(int num) {
        int reversed = 0;
        while (num != 0) {
            // Remainder of the number using the modulo
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number is " + reversed);
    }

    public static void main(String[] args) {
        // Scanner Object for Taking Input from User
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to Reverse: ");
        int num = sc.nextInt();
        ReverseNumber reverseNumber = new ReverseNumber();
        reverseNumber.reverseNum(num);
    }
}