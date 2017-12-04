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
public class Listasimple {
    public class ListaSimple {

    private NodoSimple cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }
    
    public ListaSimple(NodoSimple cabeza){
        this.cabeza=cabeza;
    }

    public NodoSimple getCabeza() {
        return cabeza;
    }
    
    // Metodo que valida si la lista simple esta vacia
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Metodo encargado de mostrar la data de cada elemento de la lista simple
    public void mostrar() {
        NodoSimple aux = cabeza;
        while (aux != null) {
            aux.mostrar();
            aux = aux.getProximo();
        }
    }
    // Metodo donde inserta al principio de la lista simple, el nodo nuevo recibido por parametro
    public void insertarPrimero(NodoSimple nuevo) {
        if (estaVacia()) {
            cabeza = nuevo;
        } else {
            nuevo.setProximo(cabeza);
            cabeza = nuevo;
        }
    }
    // Metodo donde se elimina el nodo que esta al inicio de la lista simple
    public NodoSimple eliminarPrimero() {
        NodoSimple nodoEliminado=null;
        if (!estaVacia()) {
            nodoEliminado=cabeza;
            cabeza=cabeza.getProximo();
            nodoEliminado.setProximo(null);
        } 
        return nodoEliminado;
    }
    
    // Metodo donde inserta al final de la lista simple, el nodo nuevo recibido por parametro
    public void insertarFinal(NodoSimple nuevo) {
        if (estaVacia()) {
            cabeza = nuevo;
        } else {
            NodoSimple aux=cabeza;
            while(aux.getProximo()!=null){
                aux=aux.getProximo();
            }
            aux.setProximo(nuevo);
        }
    }
    
    // Metodo donde se elimina el nodo que esta al final de la lista simple
    public NodoSimple eliminarFinal() {
        NodoSimple nodoEliminado=null;
        if (!estaVacia()){
            if(cabeza.getProximo()==null){
                nodoEliminado=cabeza;
                cabeza=null;
            }
            else{
                NodoSimple aux=cabeza;
                while(aux.getProximo().getProximo()!=null){
                    aux=aux.getProximo();
                }
                nodoEliminado=aux.getProximo();
                aux.setProximo(null);
            }
        }
        return nodoEliminado;
    }
    
    // Implementar en clases
    // Metodo que inserta el nodo nuevo recibido por parametro, en la posicion recibida por parametro
    public void insertarPosicion(NodoSimple nuevo, int posicion){
        if(estaVacia())
            cabeza=nuevo;
        else{
            if (posicion>contar()+1) 
                System.out.println("No existe la posicion, imposible insertar el nodo");
            else if (posicion == 1)
                insertarPrimero(nuevo);
            else if (posicion == contar()+1)
                insertarFinal(nuevo);
            else
            {
                NodoSimple aux = cabeza;
                int cont = 1;
                while (cont < (posicion - 1))
                {
                    cont++;
                    aux = aux.getProximo();
                }
                nuevo.setProximo(aux.getProximo());
                aux.setProximo(nuevo);
            }
        }
    }
    
    // Metodo que elimina el nodo que se encuentra en la posicion indicada por parametro
    public NodoSimple eliminarPosicion(int posicion){
        NodoSimple nodoEliminado=null;
        if(!estaVacia())
        {
            if(posicion == 1)
            {
    		nodoEliminado=eliminarPrimero();
            }
            else if(posicion == contar())
            {
    		nodoEliminado=eliminarFinal();
            }
            else if(posicion > contar() )
            {
    		System.out.println("Error: posicion nula");
            }   
            else
            {
    		NodoSimple aux = cabeza;
    		int cont = 1;
    		while(cont < posicion - 1)
    		{
    		    cont++;
                    aux = aux.getProximo();
    		}
    		nodoEliminado = aux.getProximo();
    		aux.setProximo(nodoEliminado.getProximo());
    		nodoEliminado.setProximo(null);		
            }
        }
        return nodoEliminado;
    	
    }
    
    //Metodo que cuenta los nodos de la lista
    public int contar(){
        NodoSimple aux=cabeza;
        int cont=0;
        while(aux!=null){
            aux=aux.getProximo();
            cont++;
        }
        return cont;
    }
  
}

}
