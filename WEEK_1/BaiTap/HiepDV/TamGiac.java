package ex2;

import ex1.Exercise1;

public class TamGiac {

    public int canh1 = 0;
    public int canh2 = 0;
    public int canh3 = 0;

    public TamGiac(int canh1, int canh2, int canh3) throws TamGiacException {
        
        if (checkCanh(canh1, canh2, canh3)) {
            this.canh1 = canh1;
            this.canh2 = canh2;
            this.canh3 = canh3;
            System.out.println("Tam Giac Da Duoc Tao");
        } else throw new TamGiacException();

    }
    
    public boolean checkCanh(int canh1, int canh2, int canh3){
        Exercise1 e1 = new Exercise1();
        if (e1.check(canh1) && e1.check(canh2) && e1.check(canh3))
            if ((canh1+canh2>canh3) && (canh2+canh3>canh1) && (canh1+canh3>canh2))
                return true;
        return false;
    }

}

class TamGiacException extends Exception {

    public TamGiacException() {
        super("Da co loi, khong khoi tao duoc tam giac");
    
    }
    
    
}

class Main2 {
    public static void main(String[] args) {
        try {
            TamGiac tamGiac = new TamGiac(4, 5, 3);
        } catch (TamGiacException ex) {
            System.out.println(ex);
        }
    }
}
