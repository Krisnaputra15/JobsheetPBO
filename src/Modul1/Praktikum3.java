/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author ASUS
 */
public class Praktikum3 {
 public static void main (String [] args)throws IOException {
     InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(isr);
     String nama, nis, tempatlahir, tanggallahir, jeniskelamin, alamatmalang, mottohidup;
     System.out.print("Nama : ");
     nama = br.readLine();
     System.out.print("NIS : ");
     nis = br.readLine();
     System.out.print("Tempat Lahir : ");
     tempatlahir = br.readLine();
     System.out.print("Tanggal Lahir : ");
     tanggallahir = br.readLine();
     System.out.print("Jenis Kelamin : ");
     jeniskelamin = br.readLine();
     System.out.print("Alamat di Malang : ");
     alamatmalang = br.readLine();
     System.out.print("Motto Hidup : ");
     mottohidup = br.readLine();
 }    
}
