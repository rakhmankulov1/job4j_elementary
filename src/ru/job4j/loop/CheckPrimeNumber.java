package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
            }
            if (number <= 0) {
                prime = false;
            }
        }
        return prime;
    }
}
