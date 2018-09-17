/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1Lanjutan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Latihan4 {
    public static void main (String [] args) {
        Scanner z = new Scanner(System.in);
        int bil, hasil;
        System.out.print("Masukkan suatu bilangan : ");
        bil = z.nextInt();
        hasil = faktorial(bil);
        System.out.println("Hasil faktorial dari bilangan " +bil+ "adalah " + hasil);
    }
    private static int faktorial (int a) {
        if (a==1){
            return 1;}
            else{
                    return (a*faktorial(a-1));
                    }
        }
    }

