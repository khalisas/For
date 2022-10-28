
package hellotelkom;

import java.util.Scanner;

public class Inputan {
    public static void main (String []args){
        Scanner masukkan = new Scanner (System.in);
        int a, b;
        System.out.print("Masukkan nilai a:");
        a = masukkan.nextInt();
        System.out.print("Masukkan nilai b:");
        b = masukkan.nextInt();
        System.out.println("");
        System.out.println("Nilai variabel yang ada pada program:");
        System.out.println(" a ="+a);
        System.out.println(" b ="+b);
        
        
    }
    
}
