package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*EJERCICIO: Solicitar al usuario 3 angulos de un triangulo y determinar si el triangulo es valido, la usma debe ser igual a 180°*/
        Scanner sc = new Scanner(System.in); //scanner permite leer datos desde consola
        System.out.println("Ingresa ángulo 1:");
        float ang1 = sc.nextFloat();
        sc.nextLine();
        System.out.println("Ingresa ángulo 2:");
        float ang2 = sc.nextFloat();
        sc.nextLine();
        System.out.println("Ingresa ángulo 3:");
        float ang3 = sc.nextFloat();
        sc.nextLine();
        float suma = ang1 + ang2 + ang3;
        if(suma==180){
            System.out.println("Felicidades, el triángulo es válido");

        }else{
            System.out.println("Lo siento, el triángulo no es válido :( Debe sumar 180°");

        }
        sc.close();
    }
}
