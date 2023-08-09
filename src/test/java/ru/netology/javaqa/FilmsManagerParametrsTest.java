package ru.netology.javaqa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerParametrsTest {

    @Test
    public void shouldFindAll() {
        FilmsManager manager = new FilmsManager(3);
        String film1 = "Звездные войны : Эпизод 1";
        String film2 = "Звездные войны : Эпизод 2";
        String film3 = "Звездные войны : Эпизод 3";
        String film4 = "Звездные войны : Эпизод 4";
        String film5 = "Звездные войны : Эпизод 5";
        String film6 = "Звездные войны : Эпизод 6";

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        FilmsManager manager = new FilmsManager(7);
        String film1 = "Звездные войны : Эпизод 1";
        String film2 = "Звездные войны : Эпизод 2";
        String film3 = "Звездные войны : Эпизод 3";
        String film4 = "Звездные войны : Эпизод 4";
        String film5 = "Звездные войны : Эпизод 5";
        String film6 = "Звездные войны : Эпизод 6";

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] expected = {film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastOverLimit() {
        FilmsManager manager = new FilmsManager(4);
        String film1 = "Звездные войны : Эпизод 1";
        String film2 = "Звездные войны : Эпизод 2";
        String film3 = "Звездные войны : Эпизод 3";
        String film4 = "Звездные войны : Эпизод 4";
        String film5 = "Звездные войны : Эпизод 5";
        String film6 = "Звездные войны : Эпизод 6";

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);

        String[] expected = {film6, film5, film4, film3};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
