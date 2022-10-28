
 
package hellotelkom;

import java.util.Scanner;

public class KonversiSuhu {
    public static void main (String[]args){
        Scanner masukkan = new Scanner (System.in);
        System.out.println("==== konversi suhu ====");
        int R,F,C,K;
        
        System.out.println("inputkan suhu Celcius:");
        C= masukkan.nextInt();
        System.out.println("=========");
        System.out.println("Farenheit");
        System.out.println((9*C/5)+32);
        System.out.println("=========");
        System.out.println("Reamur:");
        System.out.println(4*C/5);
        System.out.println("=========");
        System.out.println("Kelvin:");
        System.out.println(C+273);
        System.out.println("=========");
        
        
        
        
    }
    
}
