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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class archivomuestra {
    
  //metodo es para mostrar lo escrito en un archivo...
 public String leerTextoArchivo(String nombreArchivo){
  String texto = "";
  FileReader archivo = null;
  String linea = "";
  
  try{
      archivo = new FileReader(nombreArchivo);
      BufferedReader lector = new BufferedReader(archivo);
      while((linea = lector.readLine())!= null ){
          texto += linea + "\n";
      }
      
  }catch (FileNotFoundException e) {
  throw new RuntimeException("Archivo no encontrado...");
  }catch (IOException e){
  throw new RuntimeException("ocurrio un problema...");
  }finally{
   if (archivo != null) {
        try {
          archivo.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }   
    }
  return texto;
 }
    
  //metodo es para guardo lo escrito en un archivo....
 public void escribirTextoArchivo(String nombreArchivo, String texto) {
    FileWriter salida = null;
    try {
      salida = new FileWriter(nombreArchivo);
      BufferedWriter escritor = new BufferedWriter(salida);
      escritor.write(texto);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (salida != null) {
        try {
          salida.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
 
}

    

