package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
    private MovieItem[] items = new MovieItem[0];
    private int movieLimit = 10;

    public MovieManager() {
    }

    public MovieManager(int movieLimit) {
        this.movieLimit = movieLimit;
    }

    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getLast() {
        int resultLength;

        if (items.length >= movieLimit) {
            resultLength = movieLimit;
        } else {
            resultLength = items.length;
        }

        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
