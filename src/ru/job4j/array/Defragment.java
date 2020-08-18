package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int point = 0;
        int notNull = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                point = index;
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    notNull = i;
                    if (point < notNull) {
                        swap(array, point, notNull);
                    }
                }

            }
        }

        int pnt = 0;
        int ntNll = 0;
        for (int indx = 0; indx < array.length; indx++) {
            if (array[indx] != null) {
                pnt = indx;
            }
        }
        int firstInd = 0;
        int lastInd = pnt;
        invertNotNullByIndex(array, firstInd, lastInd);

        return array;
    }

    private static String[] swap(String[] arr, int pos1, int pos2) {
        String temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
        return arr;

    }

    private static String[] invertNotNullByIndex(String[] array, int begInd, int endInd) {
        for (int k = 0; k < endInd; k++) {
            String temp = array[begInd];
            array[begInd] = array[endInd];
            array[endInd] = temp;
            begInd++;
            endInd--;

        }
        return array;
    }
}
