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
public class Latihan3 {
    public static void main (String [] args) {
        Scanner z = new Scanner (System.in);
        int a, b, c;
        System.out.println("Program menjumlahkan 2 nilai");
        System.out.print("Masukkan nilai a : ");
        a = z.nextInt();
        System.out.print("Masukkan nilai b : ");
b = z.nextInt();
        System.out.print("Masukkan nilai c : ");
        c = z.nextInt();
        System.out.println();
         System.out.println("Jumlah a + b = " + (jumlah(a,b)));
         System.out.println("Jumlah b + c = " + (jumlah(b,c)));
         System.out.println("Jumlah a + c = " + (jumlah(a,c)));
    }
    private static int jumlah (int a, int b) {
        int hasil = a+b;
        return hasil;
    }
}
