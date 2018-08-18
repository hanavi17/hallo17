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
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float K,R,F;
        System.out.print("Masukan Suhu Celcius : ");
        float C = masukan.nextFloat();
        System.out.print("Pilih keluaran suhu K,R,F : ");
        String pilihan = masukan.next();
        switch(pilihan){
            case "K" : System.out.println("Suhu Kelvin = " + (K = C+273));
                break;
            case "R" : System.out.println("Suhu Reamur = " + (R = C*4/5));
                break;
            case "F" : System.out.println("Suhu Fahrenheit = " + (F = C*9/5+32));
        }
    }
}
