package org.example.session17;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        int [] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        System.out.println("Elements in array: "+ Arrays.toString(array));
        for(int i = 0; i<=4; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
        for(int value: array) {
            System.out.println("Value: " + value);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("Elements in ArrayList: " + arrayList); // este dinamic si pune doar valorile lui
        System.out.println("value at position 1: " + arrayList.get(1)); // printeaza 20
        arrayList.add(1,15);
        System.out.println("value at position 1: " + arrayList.get(1)); // printeaza 15
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
