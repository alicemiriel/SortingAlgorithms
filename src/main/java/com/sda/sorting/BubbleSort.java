package com.sda.sorting;

public class BubbleSort {

    public static void sort(int[] tablica) {

        int arraySize = tablica.length;
        int temporary = 0;
        for (int i = 0; i < arraySize; i++) {
            for (int j = 1; j < arraySize; j++) {
                if (tablica[j - 1] > tablica[j]) {
                    temporary = tablica[j - 1];
                    tablica[j - 1] = tablica[j];
                    tablica[j] = temporary;
                }
            }
        }
    }

    public static void sort2(int[] tablica) {
        int n = tablica.length;
        do {
            for (int i = 0; i < n-1; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    int zmiennaTymczasowa = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = zmiennaTymczasowa;
                }

            }
            n--;
        } while (n > 1);
    }

}
