/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Latihan10 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Masukkan batas bilangan = ");
        int batas = z.nextInt();
        int hasil = 0;
        for (int i = 1;i <=batas; i++) {
            hasil += i;   }
         System.out.println("Total jumlahnya adalah = " +hasil);
    }
}

