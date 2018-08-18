/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Biodata {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String nama, nis, tmptl, tgll, jk, alamat, motto;
        System.out.print("Masukan nama             : ");
        nama = masukan.next();
        System.out.print("Masukan NIS              : ");
        nis = masukan.next();
        System.out.print("Masukan Tempat Lahir     : ");
        tmptl = masukan.next();
        System.out.print("Masukan Tanggal Lahir    : ");
        tgll = masukan.next(); 
        System.out.print("Masukan Jenis Kelamin    : ");
        jk = masukan.next();
        System.out.print("Masukan Alamat di Malang : ");
        alamat = masukan.next();
        System.out.print("Masukan Motto            : ");
        motto = masukan.next();
        //Hasil
        System.out.println("=========================");
        System.out.println("Nama             : "+nama);
        System.out.println("NIS              : "+nis);
        System.out.println("Tempat Lahir     : "+tmptl);
        System.out.println("Tanggal Lahir    : "+tgll);
        System.out.println("Jenis Kelamin    : "+jk);
        System.out.println("Alamat di Malang : "+alamat);
        System.out.println("Motto Hidup      : "+motto);
        System.out.println("=========================");
    }
}
