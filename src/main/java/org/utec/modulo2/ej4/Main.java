package org.utec.modulo2.ej4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> redMetro = new HashMap<>();

        BFSRedMetro bfsRedMetro = new BFSRedMetro();

        redMetro.put("Estación A", Arrays.asList("EstacionB", "EstacionC"));
        redMetro.put("EstacionB", Arrays.asList("EstacionD"));
        redMetro.put("EstacionC", Arrays.asList("EstacionE"));
        redMetro.put("EstacionD", Arrays.asList("EstacionF"));
        redMetro.put("EstacionE", Arrays.asList("EstacionF"));
        redMetro.put("EstacionF", Arrays.asList());

        imprimirRedMetro(redMetro);

        System.out.println("Recorrido desde la estación A: ");
        bfsRedMetro.bfsRedMetro(redMetro, "EstacionA");
        System.out.println("\n");

        System.out.println("Recorrido desde la estacionB: ");
        bfsRedMetro.bfsRedMetro(redMetro, "EstacionB");
        System.out.println("\n");

        System.out.println("Recorrido desde la estacionC: ");
        bfsRedMetro.bfsRedMetro(redMetro, "EstacionC");
        System.out.println("\n");
    }
    private static void imprimirRedMetro(Map<String, List<String>> redMetro) {
        System.out.println("Red de Metro: ");
        for (String estacion : redMetro.keySet()) {
            List<String> conexiones = redMetro.get(estacion);
            System.out.println("Estacion: " + estacion + " está conectada a: " + conexiones);
        }
        System.out.println();
    }
}
