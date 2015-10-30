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
public class TamGiac {

    public int canh1;
    public int canh2;
    public int canh3;

    public TamGiac(int canh1, int canh2, int canh3) throws TamGiacException {
        if (isCheck(canh1, canh2, canh3)) {
            this.canh1 = canh1;
            this.canh1 = canh2;
            this.canh1 = canh3;
        } else {
            throw new TamGiacException("canh nhap vao ko hop ly");
        }
    }

    public boolean isCheck(int canh1, int canh2, int canh3) {
        if (canh1 + canh2 <= canh3 || canh1 + canh3 <= canh2 || canh2 + canh2 <= canh1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap canh 1: ");
            a = sc.nextInt();
            System.out.print("Nhap canh 2: ");
            b = sc.nextInt();
            System.out.print("Nhap canh 3: ");
            c = sc.nextInt();
            try {
                new TamGiac(a, b, c);
            } catch (TamGiacException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (InputMismatchException ex) {
            System.out.println("canh tam giac phai la kieu Int");
        };

    }
}
