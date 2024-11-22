package org.utec.modulo2.ej4;

import java.util.*;

public class BFSRedMetro {

    public void bfsRedMetro(Map<String, List<String>> redMetro, String estacionIncio) {
        Queue<String> cola = new LinkedList<>();
        Set<String> visitados = new HashSet<>();

        cola.add(estacionIncio);
        visitados.add(estacionIncio);

        while (!cola.isEmpty()) {
            String estacionActual = cola.poll();
            System.out.print(estacionActual + " ");

            for (String estacionConectada : redMetro.getOrDefault(estacionActual, new ArrayList<>())) {
                if (visitados.contains(estacionConectada)) {
                    cola.add(estacionConectada);
                    visitados.add(estacionConectada);
                }
            }
        }
    }
}
