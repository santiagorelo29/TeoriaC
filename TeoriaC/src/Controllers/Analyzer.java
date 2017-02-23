/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import java.util.logging.Logger;
/**
 *
 * @author Santiago Restrepo
 */
public class Analyzer {
    private Virus virus[];
    private byte[] contenidoArchivo;

    public Analyzer() {
        /*   
        Virus usama = new Virus();
        usama.setSecuencia();
        int []usama = new int [4];
        */
        
        
      
    }
    
    
    
    private boolean detector(byte [] contenidoArchivo){
        for(int i=0;i<contenidoArchivo.length;i++){
           
           
            if(contenidoArchivo[i]==15){
                i++;
                if(contenidoArchivo[i]==30){
                    i++;
                        if(contenidoArchivo[i]==15){
                         i++;
                            if(contenidoArchivo[i]==49){
                                    
                                       return true;
                                      
                                     }
                                else{
                                i--;
                                    }
                        }
                        else{
                        i--;
                       }
                    }
                else{
                    i--;
                }
               
            }
            
            if(contenidoArchivo[i]==72){
                i++;
                if(contenidoArchivo[i]==72){
                    i++;
                        if(contenidoArchivo[i]==15){
                         i++;
                            if(contenidoArchivo[i]==29){
                                    
                                       return true;
                                       
                                     }
                                else{
                                i--;
                                    }
                        }
                        else{
                        i--;
                       }
                    }
                else{
                    i--;
                }
               
            }
            
            if(contenidoArchivo[i]==29){
                i++;
                if(contenidoArchivo[i]==22){
                    i++;
                        if(contenidoArchivo[i]==53){
                         i++;
                            if(contenidoArchivo[i]==29){
                                    
                                       return true;
                                       
                                     }
                                else{
                                i--;
                                    }
                        }
                        else{
                        i--;
                       }
                    }
                else{
                    i--;
                }
               
            }
       
       
    
        
          
  
            
      

    }
        return false;
    }
    public Virus[] getVirus() {
        return virus;
    }

    public void setVirus(Virus[] virus) {
        this.virus = virus;
    }

    public byte[] getContenidoArchivo() {
        return contenidoArchivo;
    }

    public void setContenidoArchivo(byte[] contenidoArchivo) {
        this.contenidoArchivo = contenidoArchivo;
    }
    
    
    
    
    
}
 