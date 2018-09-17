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
public class Latihan8 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int tpa, inggris;
        System.out.print("Masukkan nilai TPA : ");
        tpa = z.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris : ");
        inggris = z.nextInt();
        if (tpa > 85 && inggris > 80) {
            System.out.println("Siswa mendapatkan beasiswa");
           }
        else {
            System.out.println("Maaf siswa tidak mendapat beasiswa");
        }
    }
}
