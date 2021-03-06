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
    private Pagina[] pila = new Pagina[100];
    private Pagina[] enEjecucion;
    private int apunPila = 0;
    private int apunEjec = 0; 
    
    

    public MemoriaPrincipal(int marcos) {
        this.enEjecucion = new Pagina[marcos];
        System.out.println("array de "+marcos+" marcos");
        for (int i = 0; i<pila.length;i++){
            pila[i] = new Pagina();
        }
    }
    
    public void addPila(Pagina p){
        pila[apunPila] = p;
        apunPila++;
        this.apunPila= apunPila%(pila.length);
        System.out.println("apun pila cuando creas "+apunPila);
    }
    
    public Pagina getPaginaEjec(int i){
        Pagina p;
        
        if(enEjecucion[i]!=null){
            p = enEjecucion[i];
            return p;
        }
    }
    
    public Pagina pushPila(){
        Pagina p = pila[0];
        for (int i = 0; i<apunPila; i++){
            if (pila[i+1]!=null){
                pila[i]= pila[i+1];
            }
            else{
                pila[i]=null;
            }
            
        }
        if(apunPila>0){
        this.apunPila=(apunPila-1)%pila.length;
        }
        System.out.println("apun pila cuando borras "+apunPila);
        return p;
    }
    
    public void reOrganize(){
        Pagina c; 
        for (int i = 0; i < enEjecucion.length; i++){
            if(enEjecucion[i]==null&&(i+1<enEjecucion.length)){
                c = enEjecucion[i+1];
                enEjecucion[i]=c;
            }
            else{
                enEjecucion[i]= this.pushPila();
            }
        }
    }
    
    public void addEjec(Pagina p){
        enEjecucion[apunEjec] = p;
        apunEjec++;
        this.apunEjec = apunEjec%enEjecucion.length;
    }
    
    public Pagina pushEjec(){
        Pagina p = enEjecucion[0];
        for (int i = 0; i<apunEjec; i++){
            if (enEjecucion[i+1]!=null){
                enEjecucion[i]= enEjecucion[i+1];
            }
            else{
                enEjecucion[i]=null;
            }
            
        }
        return p;
    }
    
    public boolean pilaEmpty(){
        int e = 0;
        for (int i = 0; i< apunPila; i++){
            if (pila[i]==null){
                e++;
            }
        }
        if(e>0){
            return true;
        }
        else{
            return false;
        }
    }

    public Pagina[] getPila() {
        return pila;
    }

    public void setPila(Pagina[] pila) {
        this.pila = pila;
    }

    public Pagina[] getEnEjecucion() {
        return enEjecucion;
    }

    public void setEnEjecucion(Pagina[] enEjecucion) {
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
