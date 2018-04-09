package com.sda.sorting;

public class CountingSort {
    public static void sort(int[] tablica) {
        //odgorny zakres ->255
        int licznikOperacji = 0;
        int[] ilosciLicz = new int[256];
        for (int i = 0; i < tablica.length; i++) {
            licznikOperacji++;

            int wartoscTablicy = tablica[i];
            ilosciLicz[wartoscTablicy]++;
        }

        int position = 0;
        // n operacji
        for (int j = 0; j < ilosciLicz.length; j++) {
            for (int i = 0; i < ilosciLicz[j]; i++) {
                licznikOperacji++;
                tablica[position] = j;
                position++;
            }
        }
        System.out.println(licznikOperacji);
    }
}
