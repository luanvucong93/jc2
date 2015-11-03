/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap_day2_JC2;

import java.util.Scanner;

/**
 *
 * @author Dinh Trong Tuyen
 */
public class MyException extends Exception {

    MyException(String s) {
        super(s);
    }

    public static void soHang() throws MyException {
        int so1, so2, ketqua;

        Scanner input = new Scanner(System.in);
        System.out.print("So hang 1: ");
        so1 = input.nextInt();
        System.out.print("So hang 2: ");
        so2 = input.nextInt();
        if (so2 == 0) {
            
            throw new MyException("Khong chia cho 0");
        }
        
        try {
            ketqua = so1 / so2;
            System.out.print("Ket Qua: " + ketqua);
        } catch (Exception e) {
            throw new MyException("Khong chia cho 0");
        }

    }

    public static void main(String[] args) throws MyException {
        try{
            soHang();
        }
        catch(MyException ex){
            System.out.println(ex.getMessage());
              
        }
    }
}
