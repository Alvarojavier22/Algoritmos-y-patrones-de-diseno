package org.utec.modulo1;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(50);

        System.out.println("Elementos en el treeSet: " + treeSet);

        System.out.println("El primer elemento del treeSet es: " + treeSet.first());
        System.out.println("EL último elemento del treeSet es: " + treeSet.last());

        System.out.println("Existe el elemento 20 en el treeSet?: " + treeSet.contains(20));
        System.out.println("------------".repeat(20));

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("B", 2);
        treeMap.put("A", 1);
        treeMap.put("C", 3);

        System.out.println("Elementos en el treeMap: " + treeMap);

        System.out.println("El primer elemento del treeMap es: " + treeMap.firstKey());
        System.out.println("El último elemento del treeMap es: " + treeMap.lastKey());
    }
}
