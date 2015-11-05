package org;

import java.io.FileNotFoundException;

/**
 * Created by 404NotFound on 11/4/2015.
 */
public class TestBigFile {
    public static void main(String[] args) throws FileNotFoundException {
        BigFile bf = new BigFile("data.txt");
        while (bf.hasNext()) {
            System.out.println(bf.next());
        }
        bf.close();
    }
}
