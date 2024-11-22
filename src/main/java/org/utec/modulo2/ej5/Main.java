package org.utec.modulo2.ej5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DFSCarreteras dfs = new DFSCarreteras();

        Map<String, List<String>> grafo = new HashMap<>();
        grafo.put("Montevideo", Arrays.asList("Salto", "Paysandu"));
        grafo.put("Salto", Arrays.asList("Artigas", "Rivera"));
        grafo.put("Paysandu", Arrays.asList("Colonia", "Carmelo"));
        grafo.put("Artigas", Arrays.asList("Tacuarembo"));
        grafo.put("Rivera", Arrays.asList("Durazno"));
        grafo.put("Colonia", Arrays.asList("Maldonado"));

        imprimirGrafoCiudades(grafo);

        System.out.println("Recorrido DFS desde Montevideo");
        dfs.dfsIterativa(grafo, "Montevideo");
        System.out.println();
        System.out.println("\n");

        System.out.println("Prueba 2: Recorrido desde Montevideo en grafo desconectado");
        Map<String, List<String>> grafo2 = new HashMap<>();
        grafo2.put("Montevideo", Arrays.asList("Salto", "Paysandu"));
        grafo2.put("Salto", Arrays.asList("Artigas"));
        grafo2.put("Paysandu", Arrays.asList("Colonia"));
        grafo2.put("Rivera", Arrays.asList("Durazno"));
        grafo2.put("Durazno", Arrays.asList("Florida"));

        imprimirGrafoCiudades(grafo2);

        dfs.dfsIterativa(grafo2, "Montevideo");
        System.out.println();
    }
    private static void imprimirGrafoCiudades(Map<String, List<String>> grafo) {
        System.out.println("Grafo de Ciudades: ");

        for(String ciudad : grafo.keySet()) {
            List<String> conexiones = grafo.get(ciudad);
            System.out.println("Ciudad " + ciudad + " está conectada a: " + conexiones);
        }
        System.out.println();
    }
}
