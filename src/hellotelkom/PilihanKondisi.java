
package hellotelkom;

import java.util.Scanner;

public class PilihanKondisi {
    public static void main (String[]args){
        Scanner masukkan = new Scanner (System.in);
        System.out.println("Silahkan masukkan nilai 1-3");
        int bil;
        bil= masukkan.nextInt();
        switch (bil){
            case 1 : System.out.println("satu");
            break;
            case 2 : System.out.println("dua");
            break;
            case 3 : System.out.println("tiga");
            
        }
          
        
        
    }
    
}
