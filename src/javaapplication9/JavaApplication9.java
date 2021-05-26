/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author SESI_SENAI
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nome1 = new String(); 
    String nome2 = new String(); 
    int time1; 
    int time2;

    System.out.print("Insira o nome do time 1: ");   
    nome1 = input.next();
    System.out.print("Insira o numero de gols do time 1: "); 
    time1 = input.nextInt();
    System.out.print("Insira o nome do time 2: ");
    nome2 = input.next();
    System.out.print("Insira o numero de gols do Time 2: ");
    time2 = input.nextInt();
     if ( time1 > time2 )
     {
     System.out.printf("O vencedor é o time: " + nome1);
     }
     if ( time1 == time2 )
     {
     System.out.printf("EMPATE");    
     }
     if (time1 < time2)
     {
     System.out.printf("o vencedor é o time:" + nome2);
     }   
    }
    
}
