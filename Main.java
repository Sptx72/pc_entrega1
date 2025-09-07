package org.example;

/*
* Autores:
* Marco Moncada Samboni
* Diego Monsalve Arteaga
* Maria Montes Garcia
* Barbara Morales Manrique
* Ariadna Morelo Mejia
* 
*/

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un año: ");
        int n = sc.nextInt();

        int siglo = siglo(n);
        System.out.println("Numero del siglo del año " + n + ": " + siglo);
        System.out.println("Primer año del siglo " + siglo + ": " + primer_anho(siglo));

    }

    private static int siglo(int anho) {
        int res = anho / 100;

        return anho % 100 == 0 ? res : res + 1;
    }

    private static int primer_anho(int siglo) {
        return ((siglo - 1) * 100) + 1;
    }
}
