/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compitotpsit;
/**
 *
 * @author informatica
 */
public class Bancone {
    
    public boolean pieno;
    public static int buffer = 1;
    
    public synchronized int preleva(){
        while(pieno == false){
            try{
                wait();
            }catch(InterruptedException e){
                
            }
        }
        pieno = false;
        notify();
        System.out.println("Il piatto numero " + buffer + " è stato consumato");
        return buffer;
    }
    
    public synchronized void deposita(int dato){
        while(pieno == true){
            try{
                wait();
            }catch(InterruptedException e){
                
            }
        }
        pieno = true;
        notify();
        buffer = dato;
        System.out.println("Il piatto numero " + buffer + " è pronto");
    }
}
