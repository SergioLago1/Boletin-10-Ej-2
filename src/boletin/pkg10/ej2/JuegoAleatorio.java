/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg10.ej2;
import javax.swing.JOptionPane;
/**
 *
 * @author slagogonzalez
 */
public class JuegoAleatorio {
    
    int numero;
    int numCorrecto;
    int i=0;
    int valor;
    int numeroIntentos;
    public int getNumber(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introducir número :"));
  }
    
    public void getNumeroIntentos(){
        
        numeroIntentos=(int)(Math.random()*10+1);
        JOptionPane.showMessageDialog(null,"Tienes "+numeroIntentos+" intentos");
    
    }
    
    
     
    
    
    public void contadorIntento(){
        numCorrecto= (int)Math.random()*50+1;
        
        for(i=0;i<numeroIntentos;i++){
            numero=getNumber();
            valor=Math.abs((numero-numCorrecto));
            if(valor>20){
                JOptionPane.showMessageDialog(null,"El número introducido esta muy lejos del correcto");
        }
            else if(valor<20 && valor>10){
                JOptionPane.showMessageDialog(null,"El número introducido esta lejos del correcto ");
            }
            else if(valor<10 && valor>5){
                JOptionPane.showMessageDialog(null,"El número introducido esta cerca del correcto ");
                
            }
            else if (valor<=5){
                JOptionPane.showMessageDialog(null,"El número introducido esta muy cerca del correcto ");
            }
            else if(valor==numero){
                JOptionPane.showMessageDialog(null,"¡El número introducido es correcto!");
                
                
            }
            
        
       
}
}
}


