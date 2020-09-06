package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int left, int right, int up) {
        int tmp = max(right, up);
        return max(left, tmp);
    }

    public static int max(int left, int right, int up, int down) {
        int tmpFirst = max(left, right);
        int tmpSecond = max(up, down);
        return max(tmpFirst, tmpSecond);
    }

    public static void main(String[] args) {
        System.out.println(Max.max(1, 2));
        System.out.println(Max.max(1, 2, 3));
        System.out.println(Max.max(1, 2, 3, 4));
    }
}
