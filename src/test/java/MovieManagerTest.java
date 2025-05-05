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

}
