package ex1;

import java.util.Scanner;

public class Exercise1 {
    private int a,b;

    public void getData() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap vao 2 so nguyen a, b");
        while(true) {
            try{
                a = Integer.parseInt(scan.next());
                b = Integer.parseInt(scan.next());
                if (check(a) && check(b))               
                    break;
                else System.out.println("So nhap la so am, hay nhap lai!");
            }catch (NumberFormatException n) {
                System.out.println("Khong phai la so, hay nhap lai!");
            }
        
        }
        
    }
    
    public boolean check(int number) {
        if (number >= 0) return true;        
        return false;
    }
    
    public int division() {
        if (b == 0) throw new ArithmeticException("Khong the chia 0");
        else return a/b;
    }
    
}

class Main1 {
    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
        e1.getData();
        try {
            System.out.println("Ket qua : " + e1.division());
        } catch (ArithmeticException a) {
            System.out.println(a);
        }
        
    }
}
