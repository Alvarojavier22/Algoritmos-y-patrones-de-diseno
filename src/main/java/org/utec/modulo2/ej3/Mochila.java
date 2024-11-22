package org.utec.modulo2.ej3;

public class Mochila {
    public static int mochila(int[] valores, int[] pesos, int capacidad, int n) {
        if (n==0 ||capacidad==0) {
            return 0;
        }
        if(pesos [n-1] > capacidad) {
            return mochila(valores, pesos, capacidad-1, n);
        }else {
            return Math.max(
                    valores[n-1] + mochila(valores, pesos, capacidad - pesos [n-1],  n-1),
                    mochila(valores, pesos, capacidad, n-1)
            );
        }
    }
}
