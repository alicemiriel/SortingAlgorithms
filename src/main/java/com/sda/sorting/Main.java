package com.sda.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] table = {1,20,2,5,10,22};
        CountingSort.sort(table);
        System.out.println(Arrays.toString(table));

//        int [] table2 = {1,200, 3, 45,400, 2};
//        CountingSort.sort(table2);
//        System.out.println(Arrays.toString(table2));
    }
}
