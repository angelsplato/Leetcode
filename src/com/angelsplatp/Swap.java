package com.angelsplatp;

public class Swap {

    public static void swap(int[] array, int firstIndex, int secondIndex) {
    int pickedFirst = array[firstIndex];
    int pickedSecond = array[secondIndex];
    array[firstIndex] = pickedSecond;
    array[secondIndex] = pickedFirst;
    return ;
    }

}
