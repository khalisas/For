
package hellotelkom;

import java.util.Scanner;

public class Beasiswa {
    public static void main (String[]args){
        Scanner masukkan = new Scanner(System.in);
        System.out.println("Masukkan nilai TPA:");
        int TPA= masukkan.nextInt();
        System.out.println("masukkan nilai Bahasa Inggris:");
        int BahasaInggris= masukkan.nextInt();
        if ((TPA > 85) && (BahasaInggris > 80))
            System.out.println(" Siswa mendapat beasiswa");
        else
            System.out.println(" Siswa tidak dapat beasiswa");
    }
        
        
        
        
    
}
