package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        if (word[word.length - 1] == post[post.length - 1] && word[word.length - 2] == post[post.length - 2]) {
            result = true;
        }
        return result;
    }
}
