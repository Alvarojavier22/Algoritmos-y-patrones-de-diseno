package org.utec.modulo1;

public class BusquedaLineal {
    public static int busquedaLineal(int [] arr, int elemento){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elemento){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arreglo = {5, 3, 8, 2, 10, 7};
        int elemento = 0;
        int resultado = busquedaLineal(arreglo, elemento);

        if(resultado !=-1){
            System.out.println("Elemento encontrado en la posición: " + resultado);
        }else {
            System.out.println("No se encontro el elemento");
        }
    }
}
