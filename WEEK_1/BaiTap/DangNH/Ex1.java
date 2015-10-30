/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author 404NotFound
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two positive integer: ");
        String num1, num2;
        do {
            System.out.print("Enter num 1: ");
            num1 = input.nextLine();
            System.out.print("Enter num 2: ");
            num2 = input.nextLine();
        } while (!isPositiveInteger(num1) || !isPositiveInteger(num2));
        
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        try {
            System.out.println("Result: " + divide(n1, n2));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
    }

    /**
     * Divide two double number a, b
     * @param a number 1
     * @param b number 2
     * @return result of div
     */
    public static double divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    /**
     * Check if number is positive integer     *
     * @param str The String represent a number to check
     * @return true if number is positive integer
     */
    public static boolean isPositiveInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        if (str.charAt(0) == '-') {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c <= '/' || c >= ':') {
                return false;
            }
        }
        return true;
    }
}
