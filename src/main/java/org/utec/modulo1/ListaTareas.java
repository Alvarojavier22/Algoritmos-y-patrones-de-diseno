package org.utec.modulo1;

import java.util.LinkedList;

public class ListaTareas {
    public static void main(String[] args) {

        LinkedList<String> listaTareas = new LinkedList<>();

        listaTareas.add("Tarea 1");
        listaTareas.add("Tarea 2");

        listaTareas.add(1, "Tarea 1.5");

        System.out.println("Lista de tareas: " + listaTareas);

        listaTareas.remove("Tarea 1");

        String resultadoObtenerElemento = listaTareas.get(1);

        System.out.println("Lista de tareas despues de borrar: " + listaTareas);

        listaTareas.set(0, "Nueva tarea 1.5");
        System.out.println("Lsita de tareas post modificar: " + listaTareas);

        System.out.println("El tamaño de la lista de tareas es: " + listaTareas.size());
    }
}
