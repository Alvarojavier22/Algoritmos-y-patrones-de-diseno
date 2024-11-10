package org.utec.modulo1;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        int[] elementos = {5, 3, 8, 2, 10, 7};

        for(int e : elementos) {
            abb.insertar(e);
        }
        System.out.println("El número 8 está en el árbol: " + abb.buscar(8));
        System.out.println("El número 11 está en el árbol: " + abb.buscar(11));

        ArbolBinarioBusqueda abc = new ArbolBinarioBusqueda();
        abc.insertar(50);
        abc.insertar(30);
        abc.insertar(70);
        abc.insertar(20);
        abc.insertar(40);
        abc.insertar(60);
        abc.insertar(80);

        System.out.println("Recorrido en órden: ");
        abc.inOrder(abc.raiz);
    }
}
