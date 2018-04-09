package com.sda.sorting;

public class InsertionSort {
    public static void sort(int[] tablica) {

        for (int i = 0; i < tablica.length; i++) {
            int key = tablica[i];
            int j = i - 1;
            while (j >= 0 && tablica[j] > key) {
                tablica[j + 1] = tablica[j];
                j = j - 1;
                tablica[j + 1] = key;
            }
        }
    }
}
