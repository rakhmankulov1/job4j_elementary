package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int i = word.length - 1; i >= word.length - 1; i--) {
            for (int j = post.length - 1; j >= post.length - 1; j--) {
                if (word[i] == post[j]) {
                    result = true;
                }
            }
        }
        return result;
    }
}
