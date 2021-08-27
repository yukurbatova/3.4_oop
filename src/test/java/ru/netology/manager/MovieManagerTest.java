package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ru.netology.domain.MovieItem;
import ru.netology.manager.MovieManager;

public class MovieManagerTest {

    @Test
    public void shouldGetLastIfMovieLimit() {
        MovieManager manager = new MovieManager();
        MovieItem first = new MovieItem(1, "Shutter Island", "thriller", false);
        MovieItem second = new MovieItem(2, "Interstellar", "fantastic", false);
        MovieItem third = new MovieItem(3, "Cruella", "comedy", false);
        MovieItem fourth = new MovieItem(4, "Twelfth Night", "comedy", false);
        MovieItem fifth = new MovieItem(5, "Reminiscence", "fantastic", true);
        MovieItem sixth = new MovieItem(6, "Old", "drama", true);
        MovieItem seventh = new MovieItem(7, "The Unfamiliar", "horror", false);
        MovieItem eighth = new MovieItem(8, "The Suicide Squad", "action", true);
        MovieItem ninth = new MovieItem(9, "Free Guy", "action", true);
        MovieItem tenth = new MovieItem(10, "Don't Breathe 2", "horror", true);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.getLast();

        MovieItem[] actual = manager.getLast();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastIfMovieOverLimit() {
        MovieManager manager = new MovieManager();
        MovieItem first = new MovieItem(1, "Shutter Island", "thriller", false);
        MovieItem second = new MovieItem(2, "Interstellar", "fantastic", false);
        MovieItem third = new MovieItem(3, "Cruella", "comedy", false);
        MovieItem fourth = new MovieItem(4, "Twelfth Night", "comedy", false);
        MovieItem fifth = new MovieItem(5, "Reminiscence", "fantastic", true);
        MovieItem sixth = new MovieItem(6, "Old", "drama", true);
        MovieItem seventh = new MovieItem(7, "The Unfamiliar", "horror", false);
        MovieItem eighth = new MovieItem(8, "The Suicide Squad", "action", true);
        MovieItem ninth = new MovieItem(9, "Free Guy", "action", true);
        MovieItem tenth = new MovieItem(10, "Don't Breathe 2", "horror", true);
        MovieItem eleventh = new MovieItem(11, "Jungle Cruise", "comedy", true);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        manager.getLast();

        MovieItem[] actual = manager.getLast();
        MovieItem[] expected = new MovieItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastIfMovieUnderLimit() {
        MovieManager manager = new MovieManager();
        MovieItem first = new MovieItem(1, "Shutter Island", "thriller", false);
        MovieItem second = new MovieItem(2, "Interstellar", "fantastic", false);
        MovieItem third = new MovieItem(3, "Cruella", "comedy", false);
        MovieItem fourth = new MovieItem(4, "Twelfth Night", "comedy", false);
        MovieItem fifth = new MovieItem(5, "Reminiscence", "fantastic", true);
        MovieItem sixth = new MovieItem(6, "Old", "drama", true);
        MovieItem seventh = new MovieItem(7, "The Unfamiliar", "horror", false);
        MovieItem eighth = new MovieItem(8, "The Suicide Squad", "action", true);
        MovieItem ninth = new MovieItem(9, "Free Guy", "action", true);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);

        manager.getLast();

        MovieItem[] actual = manager.getLast();
        MovieItem[] expected = new MovieItem[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastIfOneMovieOnly() {
        MovieManager manager = new MovieManager();
        MovieItem first = new MovieItem(1, "Shutter Island", "thriller", false);
        manager.add(first);

        manager.getLast();

        MovieItem[] actual = manager.getLast();
        MovieItem[] expected = new MovieItem[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastIfNoneMovie() {
        MovieManager manager = new MovieManager();

        manager.getLast();

        MovieItem[] actual = manager.getLast();
        MovieItem[] expected = new MovieItem[0];

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetLastIfMovieSetLimit() {
        MovieManager manager = new MovieManager(5);
        MovieItem first = new MovieItem(1, "Shutter Island", "thriller", false);
        MovieItem second = new MovieItem(2, "Interstellar", "fantastic", false);
        MovieItem third = new MovieItem(3, "Cruella", "comedy", false);
        MovieItem fourth = new MovieItem(4, "Twelfth Night", "comedy", false);
        MovieItem fifth = new MovieItem(5, "Reminiscence", "fantastic", true);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        manager.getLast();

        MovieItem[] actual = manager.getLast();
        MovieItem[] expected = new MovieItem[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}