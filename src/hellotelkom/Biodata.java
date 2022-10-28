
package hellotelkom;

import java.util.Scanner;

public class Biodata {
    public static void main (String[]args){
        Scanner masukkan = new Scanner (System.in);
        String Nama, Lahir, Kelamin, Alamat, Motto;
        int NIS, Tanggal;
        System.out.println("=== data biodata ===");
        System.out.print("Nama : ");
        Nama= masukkan.nextLine();
        System.out.println("");
        System.out.print("NIS : ");
        NIS= masukkan.nextInt();
        System.out.println("");
        System.out.print("Tempat lahir : ");
        Lahir= masukkan.next();
        System.out.println("");
        System.out.print("Tanggal lahir : ");
        Tanggal= masukkan.nextInt();
        System.out.println("");
        System.out.print("Jenis Kelamin : ");
        Kelamin= masukkan.next();
        System.out.println("");
        System.out.print("Alamat di Malang : ");
        Alamat= masukkan.next();
        System.out.println("");
        System.out.print("Motto hidup : ");
        Motto= masukkan.next();
        
    }
        
        
    
}
