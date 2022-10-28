
package hellotelkom;

import java.util.Scanner;

public class Counter {
    public static void main (String[]args){
       Scanner masukkan = new Scanner (System.in);
        System.out.println("masukkan batas bilangan:");
        int batas = masukkan.nextInt();
        int hasil=0;
       
        for (int i=1; i<=batas; i++){
            hasil+= i;
            System.out.println("total jumlah adalah:"+hasil);
        }
    }
    
}
