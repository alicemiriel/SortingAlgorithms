package com.sda.sorting;

import java.util.Arrays;

// O(log2N * N)
public class MergeSort {
    public static void sort(int[] tablica) {
        mergeSort(tablica, 0, tablica.length - 1);
    }

    public static void mergeSort(int[] tablica, int from, int to) {
        if (from == to) {
            // jwąli poOarŁ jeden element to cofamy i wracamy, aby laczyc tablice
            return;
        }
        // 0+9 / 2 = 4
        int indexMiddle = (from + to) / 2;

        //podział lewej strony, od elementu from do środka
        mergeSort(tablica, from, indexMiddle);

        //podział prawej strony, od elementu środkowego+1 do końca.
        mergeSort(tablica, indexMiddle + 1, to);

        merge(tablica, from, indexMiddle, to);
    }

    private static void merge(int[] tablica, int from, int indexMiddle, int to) {

        int[] copy = Arrays.copyOf(tablica, tablica.length);
        int indexRight = indexMiddle + 1;
        int indexLeft = from;

        //indeks pod ktory wstawiamy elementy po sprawdzeniu
        int indexPutting = from;

        // 1 warunek sprawdza czy cos jest w lewej tablicy
        // 2 warunek sprawdza czy cos jest w prawej tablicy
        while (indexLeft != indexMiddle + 1 && indexRight <= to) {
            if (copy[indexLeft] < copy[indexRight]) {
                tablica[indexPutting] = copy[indexLeft++];
            } else {
                tablica[indexPutting] = copy[indexRight++];
            }
            indexPutting++;
        }

        while (indexLeft != indexMiddle + 1) {
            tablica[indexPutting++] = copy[indexLeft++];
        }

        while (indexRight <= to) {
            tablica[indexPutting++] = copy[indexRight++];
        }
    }
}
