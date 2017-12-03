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
    private int ejecutado = 0;  //cuantas veces se ha ejecutado la pagina en mem principal
    private int exec;           //cuantas veces hay que ejecutarla
    private float time = 5000; //5s
    private int id;

    public Pagina(int n, int p) {
        ApunNext = new boolean[p];
        for (int i = 0; i < n; i++){
            this.ApunNext[i]=false;
        }
        this.ApunNext[n]=true;
        this.id = n;
        this.exec=1;
    }
    
    public Pagina(boolean[] a, int e) {
        this.ApunNext = a;
        this.exec = e;
    }
    
    public void getApunNextDisplay(){
        for (int i = 0; i<ApunNext.length;i++){
            System.out.print(ApunNext[i] +" |");
        }
        System.out.println("");
    }
    
    
    
    public void display(){
        System.out.println("");
        System.out.println("Ejecutado "+ejecutado+" veces hasta ahora");
        System.out.println("Momentos en los que se debe ejecutar:");
        for (int i = 0; i < ApunNext.length; i++){
            System.out.print(ApunNext[i]+" |");
        }
        System.out.println("");
        System.out.println("...============...");
    }

    public boolean[] getApunNext() {
        return ApunNext;
    }

    public void setApunNext(boolean[] ApunNext) {
        this.ApunNext = ApunNext;
    }

    public int getEjecutado() {
        return ejecutado;
    }

    public void setEjecutado(int ejecutado) {
        this.ejecutado = ejecutado;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
    
    public String getText(int pT){
        String line;
        
        line = "P( "+id+" )[ "+ejecutado+" /"+pT+" ]";
        
        return line;
    }
    
    public String getText(){
        String line;
        
        line = "P( "+id+" )[ "+ejecutado+" ] ~";
        
        return line;
    }
}




