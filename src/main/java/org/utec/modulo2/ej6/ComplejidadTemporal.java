package org.utec.modulo2.ej6;

public class ComplejidadTemporal {

    public int encontrarMximo(int[] arr){
        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > maximo) {
                    maximo = arr[j];
                }
            }
        }
        return maximo;
    }
    public int encontrarMximoEficiente(int[] arr){
        int maximo = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maximo) {
                maximo = arr[i];
            }
        }
        return maximo;
    }
}
