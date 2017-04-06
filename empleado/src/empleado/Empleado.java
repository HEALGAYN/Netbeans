/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Lab02-17
 */
public class Empleado {
    //salario es una variable Statica privada de la clase empleado
    private static double salario ;
    //departamento es una constante
    public static final String DEPARTAMENTO = "Desarrollo";
        
    public static void main(String[] args) {
     salario = 2000;
     System.out.println(DEPARTAMENTO + " posee un salario de : " + salario);
    }    
}

//ejercicio pràctico
//Un curso tiene cuatro notas a,b,c,d con valores asignados de 5,10,15,20
//se desea saber a+b, b-a, a*c, b/a, b%a, c%a, a++, b--
//ver la diferencia entre d++ y ++d 