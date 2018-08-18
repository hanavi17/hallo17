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
public class Alvarel {
    public static void main(String[] args) {
        
        int a,b,c,d;
        
        System.out.println("(1)");
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
        
        System.out.println("(2)");
        for(a=1; a<=5; a++){
            for(b=1; b<=1; b++){
                System.out.print("@");
            }
            if(a==5){
                for(c=1;c<=3;c++){
                    System.out.print("@");
                }
            }
        System.out.println();
        }
        
        System.out.println("(3)");
        for(a=1; a<=4; a++){
            for(c=1; c<=4; c++){
                if(a==c){
                    System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(d=3; d>0; d--){
                if(d==a){
                    System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.println("(4)");
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
        
        System.out.println("(5)");
        for(a=1; a<=5; a++){
            for(b=1; b<=1; b++){
                System.out.print("@");
            }
            if(a==1||a==3){
                for(c=1;c<=3;c++){
                    System.out.print("@");
                }
            }
            else{
                for(c=1;c<=2;c++){
                    System.out.print(" ");
                }
            }
            if(a==2){
                for(c=1;c<=1;c++){
                    System.out.print("@");
                }
            }
            for(c=2; c<=3; c++){
                if(a==c){
                    System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }
            
        System.out.println();
        }
        
        System.out.println("(6)");
        for(a=1; a<=5; a++){
            for(b=1; b<=1; b++){
                System.out.print("@");
            }
            if(a==1||a==3||a==5){
                for(c=1;c<=3;c++){
                    System.out.print("@");
                }
            }
            else{
                for(c=1;c<=2;c++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.println("(7)");
        for(a=1; a<=5; a++){
            for(b=1; b<=1; b++){
                System.out.print("@");
            }
            if(a==5){
                for(c=1;c<=3;c++){
                    System.out.print("@");
                }
            }
        System.out.println();
        }
    }
}
