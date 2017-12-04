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
    private int[] orden;
    private Pagina[] pOrdenados;

    public Proceso(Pagina[] p, int id) {
        this.p = p;
        this.id = id;
        this.pagsTotal = p.length;
        this.orden = new int[p.length];
        for (int i = 0; i < p.length; i++){
            orden[i]=i;
        }
    }
    
    public Proceso(Pagina[] p,int id, int[] orden) {
        this.p = p;
        this.pagsTotal = orden.length;
        this.id = id;
        this.orden = orden;
        
        pOrdenados = new Pagina [orden.length];
        for (int i = 0; i < orden.length; i++){
            pOrdenados[i]=p[orden[i]];
        }
    }
    
    public void displayPagOrdenado(){
        for (int i = 0; i < orden.length; i++){
            pOrdenados[i].display();
        }
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
        System.out.println("Proceso #"+(id+1));
        System.out.println("Paginas del proceso = "+p.length);
        System.out.println("Cantidad iteraciones de proceso de pagina = "+pagsTotal);
        for (int i = 0; i < p.length; i++){
            System.out.print("Pagina "+i);
            System.out.print("bool array= ");
            p[i].getApunNextDisplay();
        }
    }
    
    public String getText(){
        String line; 
        
        line = "Proceso "+id+" | ";
        for (int i = 0; i< p.length; i++){
            line+=p[i].getText();
        }
        line+="\n";
        return line;
    }
    
    public void terminateProcess() throws InterruptedException{
        for (int i = 0; i<p.length;i++){
            p[i].kill();
        }
    }
    
    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public int getPagsTotal() {
        return pagsTotal;
    }

    public void setPagsTotal(int pagsTotal) {
        this.pagsTotal = pagsTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getOrden() {
        return orden;
    }

    public void setOrden(int[] orden) {
        this.orden = orden;
    }

    public Pagina[] getpOrdenados() {
        return pOrdenados;
    }

    public void setpOrdenados(Pagina[] pOrdenados) {
        this.pOrdenados = pOrdenados;
    }
    
    
}

