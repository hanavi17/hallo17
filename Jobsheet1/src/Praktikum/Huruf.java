/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author USER
 */
public class Huruf {
    public static void main(String[] args) {
        
        int k,l,m,n,a,b,c,d;
        
        System.out.println("(N)");
        for(k=1; k<=4; k++){
            for(l=1; l<=1; l++){
                System.out.print("@");
            }
            for(m=2; m<=3; m++){
                if(k==m){
                    System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(n=1; n<=1; n++){
                System.out.print("@");
            }
            System.out.println();
        }
        
        System.out.println("(Z)");
        int z=4;
        for(a=1; a<=5; a++){
            if(a==1||a==5){
                for (b=1; b<=5; b++){
                    System.out.print("@");
                }
            }
            else{
                for(b=1; b<=5; b++){
                    if(b==z){
                        System.out.print("@");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                z--;
            }
            System.out.println();
        }
        
        System.out.println("(A)");
        for(a=1; a<=5; a++){
            for(b=1; b<=1; b++){
                System.out.print("@");
            }
            if(a==1||a==3){
                for(c=1;c<=2;c++){
                    System.out.print("@");
                }
            }
            else{
                for(c=1;c<=2;c++){
                    System.out.print(" ");
                }
            }
            for(d=1;d<=1;d++){
                System.out.print("@");
            }
        System.out.println();
        }
    }
}
