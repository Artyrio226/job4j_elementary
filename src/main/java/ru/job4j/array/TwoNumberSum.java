package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] ar = new int[0];
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int sum = array[i] + array[j];
            if (sum == target) {
                ar = new int[]{i, j};
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return ar;
    }
}
