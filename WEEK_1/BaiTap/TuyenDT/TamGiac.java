/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TamGiac;

import java.util.Scanner;

/**
 *
 * @author Dinh Trong Tuyen
 */
public class TamGiac {

    public static int canh1;
    public static int canh2;
    public static int canh3;

    public TamGiac(int canh1, int canh2, int canh3) throws TamGiacException {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public static void kiemTra() throws TamGiacException {

        if (((canh1 + canh2) < canh3) || ((canh1 + canh3) < canh2) || ((canh3 + canh2) < canh1)) {
            throw new TamGiacException("Tong do dai 2 canh phai lon hon canh con lai");
        }

    }

    public static void main(String[] args) throws TamGiacException {
        try {
            TamGiac tg = new TamGiac(6, 20, 8);

            kiemTra();
        } catch (TamGiacException ex) {
            System.out.println(ex.getMessage());

        }

    }
}
