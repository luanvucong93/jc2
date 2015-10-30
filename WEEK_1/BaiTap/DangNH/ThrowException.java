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
public class ThrowException {
    public static void main(String[] args) {
        try {
            double divide = divide(2,0);
        } catch (MyException ex) {
            ex.getMsg();
        }
    }
    public static double divide(int a, int b) throws MyException {
        try {
            return a/b;
        } catch (Exception e) {
            throw new MyException("My Ex");
        }
    }
}

