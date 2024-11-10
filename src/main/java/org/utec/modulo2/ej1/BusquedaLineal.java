package org.utec.modulo2.ej1;

public class BusquedaLineal {
    public int busquedaLineal(int [] arr, int objetivo){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==objetivo){
                return i;
            }
        }
        return -1;
    }
}
