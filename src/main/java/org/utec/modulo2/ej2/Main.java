package org.utec.modulo2.ej2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] sizes = {1000, 10000, 100000};
        Random random = new Random();

        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(100000);
            }
            int[] arrHeapSort = arr.clone();
            int[] arrQuickSort = arr.clone();

            HeapSort hs = new HeapSort();
            long startTime = System.currentTimeMillis();
            hs.sort(arrHeapSort);
            long endTime = System.currentTimeMillis();
            long promedyTime = endTime - startTime;
            System.out.println("HeapSort - tamaño: " + size + " - Tiempo: " + promedyTime + " ms.");

            QuickSort qs = new QuickSort();
            long startTimeQS = System.currentTimeMillis();
            qs.sort(arrQuickSort, 0, arrQuickSort.length - 1);
            long endTimeQS = System.currentTimeMillis();
            long promedyTimeQS = endTimeQS - startTimeQS;
            System.out.println("QuickSort - Tiempo: " + size + " - Tiempo " + promedyTime + " ms.");

            System.out.println("---------".repeat(10));
        }
    }

}
