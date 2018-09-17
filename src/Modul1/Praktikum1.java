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
public class Praktikum1 {
 public static void proseshitung() {
     Scanner z = new Scanner(System.in);
     int r;
     int phi1 = 22/7;
     System.out.println("======================================");
     System.out.println("Program penghitung luas permukaan bola");
     System.out.println("======================================");
     System.out.print("Masukkan nilai r (dalam cm) = ");
     r = z.nextInt();
     System.out.println("Proses penghitungan");
     int hasil = 4*phi1*r^2;
     System.out.println("Hasil = " + hasil + " cm");
     
 }
 public static void main (String [] args){
   proseshitung();
}
}