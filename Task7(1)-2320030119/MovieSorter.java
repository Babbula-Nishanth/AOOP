import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie other) {
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return "Movie{name='" + name + "', rating=" + rating + ", year=" + year + "}";
    }
}

public class MovieSorter {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Inception", 8.8, 2010));
        movieList.add(new Movie("The Dark Knight", 9.0, 2008));
        movieList.add(new Movie("Interstellar", 8.6, 2014));
        movieList.add(new Movie("Titanic", 7.8, 1997));
        movieList.add(new Movie("The Matrix", 8.7, 1999));

        System.out.println("Original Movie List:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }

        Collections.sort(movieList);

        System.out.println("\nSorted Movie List (by Year of Release):");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}
