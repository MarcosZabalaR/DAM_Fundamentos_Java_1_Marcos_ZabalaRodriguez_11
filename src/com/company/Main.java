package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, por favor introduzca un número entre 0 y 9999.");
        int x=sc.nextInt();
        if (x < 0 || x > 9999) {
            System.out.println("Número no válido.");
        }else{
            investor(x);
        }
    }
    /*
    Función main donde declarar la variable
     */
    private static void investor(int x) {
        String sCadena =Integer.toString(x);
        String sCadenaInvertida = "";
        for (int i=sCadena.length()-1;i>=0;i--) {
            sCadenaInvertida = sCadenaInvertida + sCadena.charAt(i);
        }
        System.out.println(sCadenaInvertida);
    }
}
    /*
Función encarga de dar la vuelta al número
     */
