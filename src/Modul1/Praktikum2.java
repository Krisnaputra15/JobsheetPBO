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
public class Praktikum2 {
 public static void main(String [] args) {
     Scanner z = new Scanner(System.in);
     int suhuc = 78;
     double reamur = suhuc * 4/5;
     double fahrenheit = (suhuc-32) * 9/5;
     int kelvin = suhuc + 273;
     System.out.println("Nilai suhu celcius = " + suhuc);
     System.out.println("Nilai suhu dalam  reamur = " + reamur);
     System.out.println("Nilai suhu dalam  fahrenheit = " +fahrenheit);
     System.out.println("Nilai suhu dalam  kelvin = " +kelvin);
 }   
}
