package net.petriv.patterns.strategy;

public class InsertionSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        }
        System.out.println("\n After insertion sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
