package org.utec.modulo2.ej3;

public class Main {
    public static void main(String[] args) {

        int [] valores = {60, 100, 120};
        int [] pesos = {10, 20, 30};
        int capacidad = 50;
        int n = valores.length;

        long comienzaRecursiva = System.nanoTime();
        int resultadoRecursivo = Mochila.mochila(valores, pesos, capacidad, n);
        long finRecursiva = System.nanoTime();
        long tiempoTotalRecursiva = finRecursiva - comienzaRecursiva;

        long comienzoDP = System.nanoTime();
        long resultadoDP = MochilaDP.mochilaDP(valores, pesos, capacidad);
        long finDP = System.nanoTime();
        long tiempoTotalDP = finDP - comienzoDP;

        System.out.println("Resultado de la versión recursiva: " + resultadoRecursivo);
        System.out.println("Tiempo de ejecución (REC): " + tiempoTotalRecursiva + " ns.");

        System.out.println("Resultado de la versión DP: " + resultadoDP);
        System.out.println("Tiempo de ejecución (DP): " + tiempoTotalDP + " ns.");
    }
}
