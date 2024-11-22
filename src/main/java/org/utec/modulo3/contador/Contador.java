package org.utec.modulo3.contador;

public class Contador {

    static int contadorGlobal = 0;

    int contadorDeObjetos = 0;

    public Contador() {
        contadorGlobal ++;
        contadorDeObjetos ++;
    }
    public void mostrarContadores(){
        System.out.println("Contador global: (Estático) " + contadorGlobal);
        System.out.println("Contador de objetos: (no estático, es de instancia): " + contadorDeObjetos);
    }
}
