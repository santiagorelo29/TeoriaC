/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
/**
 *
 * @author Santiago Restrepo
 */
public class FileManager {
   private File archivo;
   
   private byte [] archivoLeido;
   public byte[] readFile() throws IOException{
       //inteligencia leer byte del archivo
       
 
       archivoLeido=Files.readAllBytes(archivo.toPath());
       
       return archivoLeido;
   }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public byte[] getArchivoLeido() {
        return archivoLeido;
    }

    public void setArchivoLeido(byte[] archivoLeido) {
        this.archivoLeido = archivoLeido;
    }
   
   
   
}
