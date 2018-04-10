package com.sda.sorting;

public class QuickSort {
    public static void sort(int[] tablica) {
        quick(tablica, 0, tablica.length - 1);
    }

    public static void quick(int[] tablica, int from, int to) {

        int pivot = tablica[(from + to) / 2];

        int lewy = from;
        int prawy = to;
        do {
            // szuka wiekszych elementow
            while (tablica[lewy] < pivot) {
                //przesuwamy sie od lewej w prawo
                lewy++;
            }
            // szuka mnniejszych elementow
            while (tablica[prawy] > pivot) {
                // przesuwamy sie od prawej w lewo
                prawy--;
            }
            // jesli znalezlismy elementy to zamieniamy je miejscami
            if (lewy <= prawy) {
                int temporary = tablica[lewy];
                tablica[lewy] = tablica[prawy];
                tablica[prawy] = temporary;
                lewy++;
                prawy--;
            }
        } while (lewy <= prawy);

        //podtablica od poczatku do punktu podzialu
        if (prawy > from) {
            //wchodzimy rekurencyjnie w sortowanie quicksort
            quick(tablica, from, prawy);
        }

        //podtablica od punktu podzialu do konca
        if (lewy < to) {
            //wchodzimy rekurencyjnie w sortowanie quicksort
            quick(tablica, lewy, to);
        }
    }
}
