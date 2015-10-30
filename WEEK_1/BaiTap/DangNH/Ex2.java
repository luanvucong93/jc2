/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author 404NotFound
 */
public class Ex2 {
    public static void main(String[] args) {
        TamGiac tg = null;
        try {
            tg = new TamGiac(0,2,3);
        } catch (TamGiacException ex) {
            System.out.println(ex.getMessage());
            System.out.println(tg);
        }
    }
}
