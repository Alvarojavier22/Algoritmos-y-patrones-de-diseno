package org.utec.modulo2.ej5;

import java.util.*;

public class DFSCarreteras {
    public void dfsIterativa(Map<String, List<String>> grafo, String inicio){
        Stack<String> pila = new Stack<>();
        Set<String> visitados = new HashSet<>();
        pila.push(inicio);

        while(!pila.isEmpty()){
            String ciudad = pila.pop();
            if(visitados.contains(ciudad)){
                System.out.print(ciudad + " ");
                visitados.add(ciudad);

                for(String vecino : grafo.getOrDefault(ciudad, new ArrayList<>())){
                    if(!visitados.contains(vecino)){
                        pila.push(vecino);
                    }
                }
            }
        }
    }
}
