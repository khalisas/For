
package hellotelkom;

import java.util.Scanner;

public class KonversiNilai {
    public static void main (String []args){
        Scanner masukkan = new Scanner (System.in);  
        System.out.println("Masukkan nilai WEB:");
        int nilai=masukkan.nextInt();
        if(nilai >= 90)
            System.out.println("nilai A");
        else if (nilai >=75)
            System.out.println("nilai B");
        else if (nilai >=50)
            System.out.println("nilai C");
        else if (nilai >=35)
            System.out.println("nilai D");
        else
            System.out.println("nilai E");
        
                
        
    }
    
}
