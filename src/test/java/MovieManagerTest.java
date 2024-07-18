//import org.example.MovieManager2;

import org.example.PosterMovie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    MovieManager manager = new MovieManager();
    MovieManager manager2 = new MovieManager(3);


    PosterMovie movie1 = new PosterMovie(1, "Бладшот", "Боевик");
    PosterMovie movie2 = new PosterMovie(2, "Вперед", "Мультфильм");
    PosterMovie movie3 = new PosterMovie(3, "Отель Белград", "Комедия");
    PosterMovie movie4 = new PosterMovie(4, "Джентельмены", "Боевик");
    PosterMovie movie5 = new PosterMovie(5, "Человек-невидимка", "Ужасы");
    PosterMovie movie6 = new PosterMovie(6, "Тролли", "Мультфильм");
    PosterMovie movie7 = new PosterMovie(7, "Номер Один", "Комедия");
    PosterMovie movie8 = new PosterMovie(8, "Матрица", "Боевик");
    PosterMovie movie9 = new PosterMovie(9, "Бетховен", "Комедия");
    PosterMovie movie10 = new PosterMovie(10, "Шрек", "Мультфильм");

    @BeforeEach
    public void setUp() {
        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);
        manager.save(movie8);
        manager.save(movie9);
        manager.save(movie10);


        manager2.save(movie1);
        manager2.save(movie2);
        manager2.save(movie3);
        manager2.save(movie4);
        manager2.save(movie5);
        manager2.save(movie6);
        manager2.save(movie7);
        manager2.save(movie8);
        manager2.save(movie9);
        manager2.save(movie10);
    }


    @Test //Добавление фильма 1
    public void testAddMovie() {
        PosterMovie movie11 = new PosterMovie(11, "Терминатор", "Боевик");
        manager.save(movie11);
        PosterMovie[] expected = new PosterMovie[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};
        PosterMovie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMovieWithLimit() {

        PosterMovie[] expected = new PosterMovie[]{movie10, movie9, movie8};
        PosterMovie[] actual = manager2.findLast2();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMovie() {

        PosterMovie[] expected = new PosterMovie[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        PosterMovie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test //Добавление фильма 1
    public void testFindAllMovie() {

        PosterMovie[] expected = new PosterMovie[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        PosterMovie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}


