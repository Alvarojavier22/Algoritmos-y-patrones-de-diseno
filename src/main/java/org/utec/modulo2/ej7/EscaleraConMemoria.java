package org.utec.modulo2.ej7;

import java.util.HashMap;
import java.util.Map;

public class EscaleraConMemoria {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int contarFormas (int n){
        if(n < 0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int resultado = contarFormas(n-1) + contarFormas(n-2) + contarFormas(n-3);

        memo.put(n, resultado);
        return resultado;
    }
}
