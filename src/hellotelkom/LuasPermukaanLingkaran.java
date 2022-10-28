
package hellotelkom;

import java.util.Scanner;

public class LuasPermukaanLingkaran {
    public static void main (String[]args){
        Scanner masukkan = new Scanner(System.in);
        double phi = 3.14, r, luas ;
        System.out.println("masukkan r :");
        r = masukkan.nextDouble();
      
        System.out.println("=========================");
        System.out.println("Menghitung Luas Permukaan Lingkaran");
        System.out.println("=========================");
        System.out.println (4*phi*r*r);
        

        
    }
        
    
}
