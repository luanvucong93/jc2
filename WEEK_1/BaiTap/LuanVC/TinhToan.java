/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.Day1.Day2;

/**
 *
 * @author luanvucong
 */
public class TinhToan {

    public int phepChia(int a, int b) throws  MyException {
        if (b == 0) {
            throw new MyException("Ko chia dc cho 0");
        }
        return (a / b);
    }

    public boolean isCheck(int a, int b) {
        if (a >= 0 && b >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
