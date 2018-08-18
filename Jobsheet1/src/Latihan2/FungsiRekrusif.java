/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class FungsiRekrusif {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int bil,hasil;
        System.out.print("Masukkan suatu bilangan : ");
        bil = masukan.nextInt();
        hasil = faktorial(bil);
        System.out.print("Nilai Faktorial" + bil + "adalah" + hasil);
    }

    private static int faktorial(int a) {
      if(a==1)
          return 1;
      else
          return(a*faktorial(a-1));
    }
}
