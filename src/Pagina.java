
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG_
 */
public class Pagina extends Thread{
    private boolean[] ApunNext;
    private int ejecutado = 0;  //cuantas veces se ha ejecutado la pagina en mem principal
    private int exec;           //cuantas veces hay que ejecutarla
    private long time = 5000; //5s
    private int id;
    private int idP;

    public Pagina(int n, int p, int idP) {
        ApunNext = new boolean[p];
        for (int i = 0; i < n; i++){
            this.ApunNext[i]=false;
        }
        this.ApunNext[n]=true;
        this.id = n;
        this.exec=1;
        this.idP = idP;
    }
    
    public Pagina(boolean[] a, int e, int id, int idP) {
        this.ApunNext = a;
        this.exec = e;
        this.id = id;
        this.idP = idP;
    }
    
    
    public void getApunNextDisplay(){
        for (int i = 0; i<ApunNext.length;i++){
            System.out.print(ApunNext[i] +" |");
        }
        System.out.println("");
    }

    @Override
    public synchronized void start() {
        try {
            sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(Pagina.class.getName()).log(Level.SEVERE, null, ex);
        }
        ejecutado++;
        
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

    public void setTime(long time) {
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

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public int getExec() {
        return exec;
    }

    public void setExec(int exec) {
        this.exec = exec;
    }

    public int getIdPage() {
        id = Integer.valueOf(this.id);
        return id;
    }

    public void setIdPage(int id) {
        this.id = id;
    }
    
    
}




