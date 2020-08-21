package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int point = 0;
        int notNull = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                point = index;
                for (int i = point + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        notNull = i;
                        swap(array, point, notNull);
                        break;
                    }
                }

            }
        }

        return array;
    }

    private static String[] swap(String[] arr, int pos1, int pos2) {
        String temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
        return arr;

    }

}
