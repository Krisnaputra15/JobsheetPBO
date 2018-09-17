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
public class Latihan6 {
 public static void main(String[] args) {
     Scanner z = new Scanner(System.in);
     int nilai;
     System.out.print("Masukkan nilai akhir PBO = ");
     nilai = z.nextInt();
     if (nilai <70){
         System.out.println("Siswa tidak lulus");}
    if (nilai > 70){
         System.out.println("Siswa lulus");
                 
     }
     
 }   
}
