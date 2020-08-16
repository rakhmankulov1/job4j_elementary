package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int j = 0; j < post.length - 1; j++) {
            if (word[word.length - 1 - j] == post[post.length - 1 - j]) {
                result = true;
                break;
            }
        }

        return result;
    }
}

