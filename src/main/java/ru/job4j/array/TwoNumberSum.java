package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] ar = new int[0];
        int i = 0;
        int j = 1;
        while (i < array.length - 1) {
            if (array[i] + array[j] == target) {
                ar = new int[]{i, j};
                break;
            } else {
                if (array[i] + array[j] < target && j < array.length - 1) {
                    j++;
                } else {
                    i++;
                    j = i + 1;
                }
            }
        }
        return ar;
    }
}
