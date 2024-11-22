package org.utec.modulo2.ej7;

public class EscaleraSinMemoria {

    public int contarFormas(int n) {
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return contarFormas(n - 1) + contarFormas(n - 2) + contarFormas(n - 3);
    }
}
