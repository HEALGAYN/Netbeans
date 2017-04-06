/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author Lab02-17
 */
public class suerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, suerte, suma, v1, v2, v3, v4;
        System.out.println("Introduzca fecha de nacimiento");
        System.out.print("día: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("año: ");
        año = sc.nextInt();
        suma = dia + mes + año;
        v1 = suma/1000;      
        v2 = suma/100%10;  
        v3 = suma/10%10;   
        v4 = suma%10;       
        suerte = v1 + v2 + v3 + v4;
        System.out.println("Su número de la suerte es: " + suerte);
    }
}
