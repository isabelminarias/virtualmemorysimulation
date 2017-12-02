/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG_
 */
public class Proceso {
    private Pagina[] p; 
    private boolean estado;
    private int pagina=0;   //la pagina que este en proceso o la ultima que se proceso
    private int pagsTotal;  //para saber si se sigue procesando o ya termino (con pag secuencial)
    private int id; 

    public Proceso(Pagina[] p, int id) {
        this.p = p;
        this.id = id;
        this.pagsTotal = p.length;
    }
    
    public Proceso(Pagina[] p,int pagsTotal,int id) {
        this.p = p;
        this.pagsTotal = pagsTotal;
        this.id = id;
    }

    public Proceso(Pagina[] p, boolean estado) {
        this.p = p;
        this.estado = estado;
    }

    public Pagina[] getP() {
        return p;
    }

    public void setP(Pagina[] p) {
        this.p = p;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void next(){
        //algo
    }
    
    public void display(){
        System.out.println("Proceso #"+id);
        System.out.println("Paginas del proceso = "+p.length);
        System.out.println("Cantidad iteraciones de proceso de pagina = "+pagsTotal);
        for (int i = 0; i < p.length; i++){
            System.out.print("Pagina "+i);
            p[i].display();
        }
    }
    
}

