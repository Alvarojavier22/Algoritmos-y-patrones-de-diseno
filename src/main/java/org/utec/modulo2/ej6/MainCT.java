package org.utec.modulo2.ej6;

import java.util.Random;

public class MainCT {
    public static void main(String[] args) {
        ComplejidadTemporal ct = new ComplejidadTemporal();

        int[] arregloPequeno = {3,5,7,2,8,-1,4,10,12};
        System.out.println("Caso de prueba 1: Arreglo pequeño");

        long inicio1 = System.nanoTime();
        int max1 = ct.encontrarMximo(arregloPequeno);
        long fin1 = System.nanoTime();
        System.out.println("Máximo O(n^2) : " + max1);
        System.out.println("Tiempo de ejecución O(n^2) : " + (fin1 - inicio1) + " ns.");

        System.out.println("----------".repeat(10));

        long inicio2 = System.nanoTime();
        int max2 = ct.encontrarMximoEficiente(arregloPequeno);
        long fin2 = System.nanoTime();
        System.out.println("Máximo O(n) : " + max2);
        System.out.println("Tiempo de ejecución O(n): " + (fin2 - inicio2) + " ns.");

        System.out.println("*************".repeat(10));

        int[] arregloGrande = generarArregloGrande(10000);
        System.out.println("Caso de prueba 2: Arreglo grande");

        long ini1 = System.nanoTime();
        int m1 = ct.encontrarMximo(arregloGrande);
        long f1 = System.nanoTime();
        System.out.println("Máximo (n^2): " + m1);
        System.out.println("Tiempo de ejecución O(n): " + (f1 - ini1) + " ns.");

        long ini2 = System.nanoTime();
        int m2 = ct.encontrarMximoEficiente(arregloGrande);
        long f2 = System.nanoTime();
        System.out.println("Máximo O(n): " + m2);
        System.out.println("Tiempo de ejecución O(n): " + (f2 - ini2) + " ns.");
    }
    public static int[] generarArregloGrande(int tamano) {
        Random random = new Random();
        int[] arreglo = new int[tamano];
        for (int i = 0; i < tamano; i++){
            arreglo[i] = random.nextInt(10000);
        }
        return arreglo;
    }
}
