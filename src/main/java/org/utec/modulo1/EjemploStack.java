package org.utec.modulo1;

import java.util.Stack;

public class EjemploStack {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        pila.push("Libro 1");
        pila.push("Libro 2");
        pila.push("Libro 3");

        System.out.println(pila.pop());

        System.out.println(pila.peek());

        System.out.println("La pila está vacía? : " + pila.isEmpty());

        System.out.println("Posición del libro 1: " + pila.search("Libro 1"));

        pila.clear();
        System.out.println("La pila está vacía? : " + pila.isEmpty());
    }
}
