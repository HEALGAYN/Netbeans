/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

/**
 *
 * @author Lab02-17
 */
public class ejemplo {

    /**
     * Una sentencia switch permite a una variable ser probada por 
     * una lista de condiciones. Cada condición se llama case.
     * 
     */
    public static void main(String[] args){
      char departamento = 'B';

      switch(departamento)
      {
         case 'A' :
            System.out.println("Desarrollo");
            break;
         case 'B' :
    System.out.println("Recursos Humanos");
            break;
         case 'C' :
            System.out.println("Finanzas");
            break;
         case 'D' :
            System.out.println("Mercadeo");
         default :
            System.out.println("Departamento invalido");
      }
      System.out.println("Código para el departamento es " + departamento);
   }
}