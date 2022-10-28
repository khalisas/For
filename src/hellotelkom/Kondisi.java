
package hellotelkom;

import java.util.Scanner;

public class Kondisi {
    public static void main (String[]args){
        Scanner masukkan = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan  nilai PBO akhir");
        nilai = masukkan.nextInt();
        if (nilai <70)
            System.out.println("Siswa Tidak lulus");
        if (nilai >70)
            System.out.println("Siswa lulus");
        
        
    }
    
}
