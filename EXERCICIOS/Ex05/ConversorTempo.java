package EXERCICIOS.Ex05;

import java.util.Scanner;

/*
Escreva um programa que leia um valor inteiro representando 
um total de segundos e o decomponha em horas, minutos e 
segundos restantes.
*/


public class ConversorTempo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Determine uma quantidade em segundos: ");
        int segundos = sc.nextInt();

        int minutos = segundos / 60;
        segundos = segundos % 60;
        int horas = minutos / 60;
        minutos = minutos % 60;

        System.out.print(horas + " hora(s), " + minutos);
        System.out.print(" minuto(s) e " + segundos);
        System.out.println(" segundo(s).");
        
        sc.close();
    }
}