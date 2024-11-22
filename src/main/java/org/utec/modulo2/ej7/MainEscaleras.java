package org.utec.modulo2.ej7;

public class MainEscaleras {
    public static void main(String[] args) {
        int n = 35;

        EscaleraSinMemoria esm = new EscaleraSinMemoria();
        long inicioSinMemo = System.currentTimeMillis();
        int resultadoSinMemo = esm.contarFormas(n);
        long finSinMemo = System.currentTimeMillis();
        long tiempoSinMemo = finSinMemo - inicioSinMemo;

        System.out.println("Formas sin memorización (n= "+n+"): " + resultadoSinMemo);
        System.out.println("Tiempo sin memorización: " + tiempoSinMemo + " ns.");

        EscaleraConMemoria ecm = new EscaleraConMemoria();
        long incioConMemoria = System.nanoTime();
        int resultadoConMemoria = ecm.contarFormas(n);
        long finConMemoria = System.nanoTime();
        long tiempoConMemoria = finConMemoria - incioConMemoria;

        System.out.println("Formas con memorización (n= "+n+"): " + resultadoConMemoria);
        System.out.println("Tiempo con memorización: " + tiempoConMemoria + " ns.");
    }
}
