package org.utec.modulo1;

import java.util.HashMap;
import java.util.Map;

public class TablaHash {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Clave 1", 10);
        hashMap.put("Clave 2", 20);
        hashMap.put("Clave 3", 30);

        System.out.println("El valor de la clave 2 es: " + hashMap.get("Clave 2"));

        if(hashMap.containsKey("Clave 1")){
            System.out.println("La clave 1 existe en el hashmap!");
        }
        if(hashMap.containsValue(20)){
            System.out.println("El valor 20 existe en el hashmap!");
        }
        hashMap.replace("Clave 2", 25);
        System.out.println("El valor de la clave 2 es: " + hashMap.get("Clave 2"));

        hashMap.remove("Clave 1");
        System.out.println("Imprimo el contenido del hashmap: " + hashMap);

        System.out.println("Iterando sobre el HASHMAP: " );

        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println("Clave: " + entry.getKey() + " valor: " + entry.getValue());
        }
    System.out.println("Que tamaño tiene el hashmap: " + hashMap.size());

        hashMap.clear();
        System.out.println("EL tamaño del hash despeus del clear es: " + hashMap.size());

    }
}
