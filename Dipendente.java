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
public class Dipendente extends Thread{
    
    public int dato = 0;
    public Bancone bancone = new Bancone();
    
    public Dipendente(Bancone bancone){
        this.bancone = bancone;
    }
    
    @Override
    public void run() {
        
        for(int i = 0; i < 10; i++){
            dato = Bancone.buffer;
            bancone.preleva();
            Bancone.buffer ++;
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                
            }
        }
        System.out.println("Termine pausa pranzo:");
    }
}
