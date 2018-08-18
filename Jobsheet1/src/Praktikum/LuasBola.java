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
public class LuasBola {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float r,hasil;
        System.out.print("Masukan Jari-Jari : ");
        r = masukan.nextFloat();
        hasil = (float) (4 * 3.14 * r * r);
        System.out.println("==============================");
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.println("==============================");
        System.out.println("Luas Permukaan Bola = "+hasil);
    }
}
