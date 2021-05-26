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
public class Cuoco extends Thread{
    
    public int dato = 0;
    public Bancone bancone = new Bancone();
    
    public Cuoco(Bancone bancone){
        this.bancone = bancone;
    }
    
    @Override
    public void run() {
        
        System.out.println("Inizio pausa pranzo:");
        
        for(int i = 0; i < 10; i++){
            dato = Bancone.buffer;
            bancone.deposita(dato);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                
            }
        }
    }
}
