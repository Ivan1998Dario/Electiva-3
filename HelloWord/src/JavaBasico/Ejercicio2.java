/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

import java.util.Scanner;
import java.security.SecureRandom;

/**
 *
 * @author ESTUDIANTE
 */
public class Ejercicio2 {
    
   
    
    public static void main (String[] args){
    int vInt;
     float vFloat;
    String  Vstr;
    boolean b1,b2;
    vInt=5+2;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("vInt = 5+2: " + vInt);
    vInt=5-2;
    System.out.println("vInt = 5-2: " + vInt);
    vInt=5*2;
    System.out.println("vInt = 5*2: " + vInt);
    vInt=5%2;
    System.out.println("vInt = 5%2: " + vInt);
    vInt=5^2;
    System.out.println("vInt = 5^2: " + vInt);
    
   
    
    vFloat=5+2;
    System.out.println("\nvInt = 5+2: " + vFloat);
    vFloat=5-2;
    System.out.println("vInt = 5-2: " + vFloat);
    vFloat=5*2;
    System.out.println("vInt = 5*2: " + vFloat);
    vFloat=5%2;
    System.out.println("vInt = 5%2: " + vFloat);
    vFloat=5^2;
    System.out.println("vInt = 5^2: " + vFloat);
    
    b1=true;
    b2=false;
    System.out.println("\n b1 and b2:" + (b1 && b2));
    System.out.println("\n b1 or b2:" + (b1 || b2));
    System.out.println("\n not b1:" + (!b1));
    System.out.println("\n not b2:" + (!b2));
    
    /*System.out.println("Introduzca texto ");
    System.out.println(scan.nextLine());*/
    
    //CICLOS
    int i;
    for(i=0; i<5; i++){
        if(i==3)
            continue;
        System.out.println();
    }
    System.out.println(i);
    
     i=2;
     while (i<20){
         System.out.println(i);
            i += 2;
            
     }
     i=2;
     do {
         System.out.println(i);
         i+=2;
     } while (i<20);
     
     if(i<=8){
         System.out.println("Menor igual que 8");
     } else if(i>10) {
         System.out.println("Mayor a 10");
     } else {
         System.out.println("Entre 9 y 10");
     }
        
     switch (i) {
         case 8:
             System.out.println("Igual que 8");
             break;
         case 10:
             System.out.println("igual que 10");
             break;
         default:
             System.out.println("Diferente");
             
     }
    
    
    i=5;
    i=++i + 2;
    System.out.println(i);
    i=5;
    i=i++ + 2;   
    System.out.println(i);
    }
    
    //Clase 3 (Vectores)
    
    
        int i;{
    int[] vi = new int[12]; //declaracion y creacion del vector
    
    System.out.printf("%s%8%n", "Indice", "Valor");
    for (i=0; i<vi.length; i++)
    System.out.printf("%5d%8d%n", i, vi[i]);
        
    //Declaracion y inicializacion
    
    int [] vj={32, 27, 14, 18, 95, 64, 90, 70, 60};
    
    System.out.printf("%s%8s%n", "Indice", "Valor");
    for (i=0; i<vj.length; i++)
    System.out.printf("%5d%8d%n", i, vi[i]);

   
    SecureRandom numAle=new SecureRandom
   
            
    for (i=0; i<vi.length; i++)

        }
      
}
