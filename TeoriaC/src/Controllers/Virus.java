/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

/**
 *
 * @author Santiago Restrepo
 */
public class Virus {
 private String name;
 private byte[] secuencia; //vector de bytes
 
 
public Virus(){
    
}

    public String getName() {
        
        return name;
    }

  

    public byte[] getSecuencia() {
        
        return secuencia;
    }

    void setSecuencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 
    
}
