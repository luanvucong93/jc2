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
public class TamGiac {

    private int canh1;
    private int canh2;
    private int canh3;

    public TamGiac() {}

    public TamGiac(int canh1, int canh2, int canh3) throws TamGiacException {
        if (isValidTriangle(canh1, canh2, canh3)) {
            this.canh1 = canh1;
            this.canh2 = canh2;
            this.canh3 = canh3;            
        }else throw new TamGiacException("Is not valid triangle");
    }

    /**
     * Check the steadiness of this triangle
     *
     * @return true if this triangle is a valid triangle
     */
    public boolean isValidTriangle() {
        return (canh1 > 0 &&canh2 > 0 && canh3 >0 && 
                (canh1 + canh2) > canh3) && ((canh2 + canh3) > canh1) && ((canh1 + canh3) > canh2);
    }
    
    /**
     * Check the steadiness of a triangle
     * @param canh1
     * @param canh2
     * @param canh3
     * @return true if three side of triangle make a valid triangle
     */
    
    private boolean isValidTriangle(int canh1, int canh2, int canh3) {
        return ((canh1 + canh2) > canh3) && ((canh2 + canh3) > canh1) && ((canh1 + canh3) > canh2);
    }
}
