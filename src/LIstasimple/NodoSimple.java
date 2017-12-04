/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIstasimple;


/**
 *
 * @author joseguerrero
 */
public class NodoSimple {
    
    private String datoTexto;
    private int datoEntero;
    private NodoSimple proximo;
   
    
    public NodoSimple(){
        
    }
    
    public NodoSimple(String datoTexto,int datoEntero){
        this.datoTexto=datoTexto;
        this.datoEntero=datoEntero;
        proximo=null;
    }

    public String getDatoTexto() {
        return datoTexto;
    }

    public void setDatoTexto(String datoTexto) {
        this.datoTexto = datoTexto;
    }

    public int getDatoEntero() {
        return datoEntero;
    }

    public void setDatoEntero(int datoEntero) {
        this.datoEntero = datoEntero;
    }

    public NodoSimple getProximo() {
        return proximo;
    }

    public void setProximo(NodoSimple proximo) {
        this.proximo = proximo;
    }
    
    public void mostrar(){
        System.out.println("{Texto: "+datoTexto+", Entero:"+datoEntero+"}");
    }
    
}