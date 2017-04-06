
package promedio;
import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in); 
        int promedio;       
        System.out.print("INGRESE SU PROMEDIO: " );
        promedio = valor.nextInt();
        
        if(promedio >=13){
        System.out.println("aprobaste con un promedio de: " + promedio);
        }
        else{
          System.out.println("Desaprobaste con un promedio de: " + promedio);}
    }
    
}
