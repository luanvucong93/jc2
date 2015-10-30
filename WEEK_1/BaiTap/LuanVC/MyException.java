/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.Day1.Day2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luanvucong
 */
public class MyException extends Exception  {

    public MyException(String s){
       super(s);
    }
    
    public static void main(String[] args)  {
        int a, b;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhap a:");
            a = sc.nextInt();
            System.out.print("Nhap b:");
            b = sc.nextInt();

            TinhToan tt = new TinhToan();
            if (tt.isCheck(a, b)) {
                try {
                    System.out.println("KQ:"+tt.phepChia(a, b));
                } catch (MyException ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                System.out.println("so nhap vao ko phai so nguyen duong!!!");
            }
           
        } catch (InputMismatchException e) {
            System.out.println("ko phai so nguyen");
        }
    }

}
