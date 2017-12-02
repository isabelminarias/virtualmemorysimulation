/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG_
 */
public class Pagina {
    private boolean[] ApunNext;
    private int ejecutado = 0;
    private float time = 5000; //5s

    public Pagina(boolean[] ApunNext) {
        this.ApunNext = ApunNext;
    }
    
    public void getApunNextDisplay(){
        for (int i = 0; i<ApunNext.length;i++){
            System.out.print(ApunNext[i] +" |");
        }
    }
    
    
    public void display(){
        
        System.out.println("Ejecutado "+ejecutado+" veces hasta ahora");
        System.out.println("Momentos en los que se debe ejecutar:");
        for (int i = 0; i < ApunNext.length; i++){
            System.out.print(ApunNext[i]+" |");
        }
        System.out.println("");
        System.out.println("...============...");
    }

    
    
    
    
    
    
    
}




