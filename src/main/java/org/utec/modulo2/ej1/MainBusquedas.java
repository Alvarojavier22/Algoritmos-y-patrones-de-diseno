package org.utec.modulo2.ej1;

import java.util.Arrays;

public class MainBusquedas {
    public static void main(String[] args) {

        int n = 100000;
        int [] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int objetivo = n;

        BusquedaBinaria bb = new BusquedaBinaria();
        BusquedaLineal bl = new BusquedaLineal();

        long inicioLineal = System.nanoTime();
        bl.busquedaLineal(arr, objetivo);
        long finLineal = System.nanoTime();
        long tiempoLineal =finLineal - inicioLineal;

        Arrays.sort(arr);
        long inicioBinaria = System.nanoTime();
        bb.busquedaBinaria(arr, objetivo);
        long finBinaria = System.nanoTime();
        long tiempoBinaria =finBinaria - inicioBinaria;

        System.out.println("Tiempo busqueda lineal: " + tiempoLineal + " nanosegundos");
        System.out.println("Tiempo binaria: " + tiempoBinaria + " nanosegundos");
    }
}
