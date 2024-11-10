package org.utec.modulo1;

public class ArbolBinarioBusqueda {

    Nodo raiz;
    public ArbolBinarioBusqueda() {
        raiz = null;
    }
    private Nodo insertarRecursivo(Nodo raiz, int valor){
        if(raiz == null){
            raiz = new Nodo(valor);
            return raiz;
        }
        if(valor < raiz.valor){
            raiz.izquierda = insertarRecursivo(raiz.izquierda, valor);
        }else if(valor > raiz.valor){
            raiz.derecha = insertarRecursivo(raiz.derecha, valor);
        }
        return raiz;
    }
    public void insertar(int valor){
        raiz = insertarRecursivo(raiz, valor);
    }
    private boolean buscarRecursivo(Nodo raiz, int valor){
        if(raiz == null){
            return false;
        }
        if(valor == raiz.valor){
            return true;
        }
        if(valor < raiz.valor){
            return buscarRecursivo(raiz.izquierda, valor);
        }
        return buscarRecursivo(raiz.derecha, valor);
    }
    public boolean buscar(int valor){
        return buscarRecursivo(raiz, valor);
    }
    public void inOrder(Nodo nodo){
        if(nodo != null){
            inOrder(nodo.izquierda);
            System.out.println(nodo.valor + " ");
            inOrder(nodo.derecha);
        }
    }
}
