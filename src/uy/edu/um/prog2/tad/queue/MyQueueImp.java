package uy.edu.um.prog2.tad.queue;

import Exceptions.EmptyQueueException;
import uy.edu.um.prog2.tad.linkedlist.ListaDoblementeEncadenada;
import uy.edu.um.prog2.tad.linkedlist.Nodo;


public class MyQueueImp <T extends Comparable<T>> implements MyQueue {
    private ListaDoblementeEncadenada<T> lista;

    public MyQueueImp() {
        this.lista = new ListaDoblementeEncadenada<>();
    }

    public Nodo<T> obtenerPrimerNodo(){
        T t = lista.get(0);
        Nodo<T> nodo = new Nodo<>(t);
        return nodo;
    }

    @Override
    public void enqueue(Object element) {
        Nodo<T> nodoAAgregar;
        nodoAAgregar = new Nodo<T>((T)element);
        lista.add(nodoAAgregar.getValue());
    }

    @Override
    public Object dequeue() throws EmptyQueueException {
        if (lista.size()!=0){
            Nodo<T>primero = obtenerPrimerNodo();
            lista.remove(0);
            return primero.getValue();
        }
        else{
            throw new EmptyQueueException();
        }
    }

    @Override
        public boolean isEmpty() {
        return lista.isEmpty();
        }

    @Override
    public int size() {
        return lista.size();
    }
}

