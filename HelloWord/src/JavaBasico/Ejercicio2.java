/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;
import java.util.Scanner;
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
    for(i=0; i<5; i++)
    
    {
        System.out.println(i);
    }
    
    i=5;
    i=++i + 2;
    System.out.println(i);
    i=5;
    i=i++ + 2;   
    System.out.println(i);
    }
    
   
}