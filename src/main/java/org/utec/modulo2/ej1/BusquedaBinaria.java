package org.utec.modulo2.ej1;

public class BusquedaBinaria {
    public int busquedaBinaria(int [] arr, int objetivo) {
        int inicio = 0, fin = arr.length - 1;
        while(inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if(arr[medio] == objetivo) {
                return medio;
            }
            if(arr[medio] < objetivo) {
                inicio = medio + 1;
            }else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}
