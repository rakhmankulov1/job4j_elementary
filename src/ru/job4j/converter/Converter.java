package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");

        //test rubleToEuro()
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        //test rubleToDollar()
        int inDol = 180;
        int expectedDol = 3;
        int outDol = rubleToDollar(inDol);
        boolean passedDol = expectedDol == outDol;
        System.out.println("180 rubles are 3. Test result : " + passedDol);
    }
}
