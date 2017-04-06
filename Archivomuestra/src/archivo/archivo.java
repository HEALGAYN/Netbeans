/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

/**
 *
 * @author Lab02-17
 */
public class archivo {
    public  static void main (String[] args){
        archivomuestra archivo = new archivomuestra();
        String entrada = archivo.leerTextoArchivo("Prueba.txt");
        System.out.println(entrada);
        archivo.escribirTextoArchivo("CopiaPrueba.txt", entrada);
    
    }
    
 }
