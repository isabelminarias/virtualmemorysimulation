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
    private Proceso[] pila = new Proceso[100];
    private Proceso[] enEjecucion;
    private int apunPila = 0;
    private int apunEjec; 

    public MemoriaPrincipal(int marcos) {
        this.enEjecucion = new Proceso[marcos];
    }
    
    public void addPila(Proceso p){
        pila[apunPila] = p;
        apunPila++;
    }
    
    public Proceso pushPila(){
        Proceso p = pila[0];
        for (int i = 0; i<apunPila; i++){
            if (pila[i+1]!=null){
                pila[i]= pila[i+1];
            }
            else{
                pila[i]=null;
            }
            
        }
        return p;
    }

    public Proceso[] getPila() {
        return pila;
    }

    public void setPila(Proceso[] pila) {
        this.pila = pila;
    }

    public Proceso[] getEnEjecucion() {
        return enEjecucion;
    }

    public void setEnEjecucion(Proceso[] enEjecucion) {
        this.enEjecucion = enEjecucion;
    }

    public int getApunPila() {
        return apunPila;
    }

    public void setApunPila(int apunPila) {
        this.apunPila = apunPila;
    }

    public int getApunEjec() {
        return apunEjec;
    }

    public void setApunEjec(int apunEjec) {
        this.apunEjec = apunEjec;
    }
    
    
    
    
}
