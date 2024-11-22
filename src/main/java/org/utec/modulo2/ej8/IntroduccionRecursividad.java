package org.utec.modulo2.ej8;

public class IntroduccionRecursividad {
    public static void main(String[] args) {

        int numeroSuma = 5;
        System.out.println("La suma de números desde 1 hasta " + numeroSuma + " es: "+ suma(numeroSuma));

        int numeroCuentaRegresiva = 5;
        System.out.println("Cuenta Regresiva desde: " + numeroCuentaRegresiva);
        cuentaRegresivaRecursiva(numeroCuentaRegresiva);
    }
    public static int suma(int n) {
        if(n<= 1){
            return n;
        }
        return n + suma(n-1);
    }
    public static void cuentaRegresivaRecursiva(int n) {
        if(n <= 0){
            System.out.println("Fin de la cuenta regresiva!");
            return;
        }
        System.out.println(n);
        cuentaRegresivaRecursiva(n-1);
    }
}
