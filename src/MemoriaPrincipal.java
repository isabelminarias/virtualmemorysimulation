/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG_
 */
public class MemoriaPrincipal {
    private int[][] pila;
    private Pagina[][] marcos;

    public MemoriaPrincipal(int[][] pila, Pagina[][] marcos) {
        this.pila = pila;
        this.marcos = marcos;
    }
    
    public void addPila(Pagina p, int pos){
        int i =0;
        do{
           i++; 
        }while(pila[1][i] != 0 );
        
    }
    
    
}
