
package hellotelkom;

import java.util.Scanner;

public class PernyataanWhile {
    public static void main (String[]args){
        Scanner masukkan = new Scanner(System.in);
        int a=0,total=0,bil=7;
        while(bil!=0){
            a++;
            System.out.println("masukkan bilangan ke- "+a+":");
            bil = masukkan.nextInt();
            total+= bil;
        }
        System.out.print("total jumlah"+ (a-1) +"bilangan:");
        System.out.println(total);
            
            
        }
       
        
    }
    

