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
public class Latihan2 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int pilihan = 9;
        do {
            System.out.println("\nMenu Luas Bangun\n");
            System.out.println("1. Menghitung luas persegi");
            System.out.println("2. Menghitung luas persegi panjang");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = in.nextInt();
            switch (pilihan){
                case 1:LuasPersegi();break;
                case 2 : LuasPersegiPanjang();break;
            }
        }
        while (pilihan != 3);}
    
private static void LuasPersegi(){
  Scanner in = new Scanner(System.in);
  float sisi, luas;
  System.out.print("Masukkan nilai sisi : ");
  sisi = in.nextFloat();
  luas = sisi * sisi;
  System.out.println ("Luas persegi adalah " + luas);
}
private static void LuasPersegiPanjang (){
  Scanner in = new Scanner (System.in);
  float panjang, lebar, luas;
  System.out.print("Masukkan nilai panjang : ");
  panjang = in.nextFloat();
  System.out.print("Masukkan nilai lebar : ");
  lebar = in.nextFloat();
  luas = panjang * lebar;
  System.out.println("Luas persegi panjang adalah " + luas);
}}
        
    

