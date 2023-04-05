package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] ar = new int[0];
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                ar = new int[]{i, j};
                break;
            }
            if ((i + j) % 2 == 0) {
                j--;
            } else {
                i++;
            }
        }
        return ar;
    }
}
