package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        percent = percent / 100;
        double loan = (amount + (amount * percent)) - salary;
        while (loan > 0) {
            year++;
            loan = (loan + (loan * percent)) - salary;
        }

        return year;
    }
}
