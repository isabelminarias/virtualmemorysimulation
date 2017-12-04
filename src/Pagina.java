
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
    private long time = 6000; //2s
    private int id;
    private int idP;
    private boolean alert = false;

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
    
    public Pagina(){
        this.id=101;
        this.idP=101;
        this.time=3000;
        
    }
    
    
    public void getApunNextDisplay(){
        for (int i = 0; i<ApunNext.length;i++){
            System.out.print(ApunNext[i] +" |");
        }
        System.out.println("");
    }

    @Override
    public synchronized void run() {
        System.out.println("Ejecuto..."+this.id+"|"+this.idP);
        try {
            sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(Pagina.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.alert = true;
        
       this.id=101;
       this.idP=101;
       System.out.println("Finalizo..."+this.id+"|"+this.idP);
        
    }
    
    

    public void kill() throws InterruptedException{
        if (alert){
            this.join();
        }
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


    public void setIdPage(int id) {
        this.id = id;
    }

    public int getIdPage() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAlert() {
        return alert;
    }

    public void setAlert(boolean alert) {
        this.alert = alert;
    }
    
    
}




