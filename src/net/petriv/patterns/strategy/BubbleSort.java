package net.petriv.patterns.strategy;

public class BubbleSort implements Sorting {

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("Array after bubble sort");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

