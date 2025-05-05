import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void testAddMovie(){
        MovieManager movieManager = new MovieManager();

        String[] expected = {};
        String[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testAddMovie2(){
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie("Gentlemen");
        String[] expected = {"Gentlemen"};
        String[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testAddMovie3(){
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie("Gentlemen");
        movieManager.addMovie("Astral");
        String[] expected = {"Gentlemen", "Astral"};
        String[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testAddMovie4(){
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie("Gentlemen");
        movieManager.addMovie("Astral");
        movieManager.addMovie("The killers");
        String[] expected = {"Gentlemen", "Astral", "The killers"};
        String[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testAddMovie5() {
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie("Gentlemen");
        movieManager.addMovie("Astral");
        movieManager.addMovie("The killers");
        movieManager.addMovie("Spiderman");
        movieManager.addMovie("Batman");
        String[] expected = {"Gentlemen", "Astral", "The killers", "Spiderman", "Batman"};
        String[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastMovie() {
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie("Gentlemen");
        movieManager.addMovie("Astral");
        movieManager.addMovie("The killers");
        movieManager.addMovie("Spiderman");
        String[] expected = {"Spiderman", "The killers", "Astral", "Gentlemen"};
        String[] actual = movieManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastMovie2() {
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie("Gentlemen");
        movieManager.addMovie("Astral");
        movieManager.addMovie("The killers");
        String[] expected = {"The killers", "Astral", "Gentlemen"};
        String[] actual = movieManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastMovie3() {
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie("Gentlemen");
        movieManager.addMovie("Astral");
        movieManager.addMovie("The killers");
        movieManager.addMovie("Spiderman");
        movieManager.addMovie("Batman");
        String[] expected = {"Batman", "Spiderman", "The killers", "Astral", "Gentlemen"};
        String[] actual = movieManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastMovie4() {
        MovieManager movieManager = new MovieManager(3);
        movieManager.addMovie("Gentlemen");
        movieManager.addMovie("Astral");
        movieManager.addMovie("The killers");
        movieManager.addMovie("Spiderman");
        String[] expected = {"Spiderman", "The killers", "Astral"};
        String[] actual = movieManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testLastMovie5() {
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie("Gentlemen");
        movieManager.addMovie("Astral");
        movieManager.addMovie("The killers");
        movieManager.addMovie("Spiderman");
        movieManager.addMovie("Batman");
        movieManager.addMovie("Inception");

        String[] expectedLast = {"Inception", "Batman", "Spiderman", "The killers", "Astral"};
        String[] actualLast = movieManager.findLast();
        Assertions.assertArrayEquals(expectedLast, actualLast);
    }

    @Test
    public void testLastMovie6() {
        MovieManager movieManager = new MovieManager(2);
        movieManager.addMovie("Gentlemen");
        movieManager.addMovie("Astral");
        movieManager.addMovie("The killers");

        String[] expectedLast = {"The killers", "Astral"};
        String[] actualLast = movieManager.findLast();
        Assertions.assertArrayEquals(expectedLast, actualLast);
    }
}
