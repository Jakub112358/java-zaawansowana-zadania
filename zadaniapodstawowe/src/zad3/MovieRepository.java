package zad3;

import java.util.Arrays;

public class MovieRepository implements MovieRepositoryApi {

    private Movie[] moviesArray;

    public MovieRepository(Movie[] moviesArray) {
        this.moviesArray = moviesArray;
    }

    @Override
    public void add(Movie addedMovie) {
        this.moviesArray = Arrays.copyOfRange(moviesArray, 0, moviesArray.length + 1);
        this.moviesArray[moviesArray.length - 1] = addedMovie;
    }

    @Override
    public void delete(Movie deletedMovie) {
        int counter = 0;
        for (int i = 0; i < moviesArray.length; i++) {
            if (moviesArray[i].isEqual(deletedMovie)) {
           // if (moviesArray[i].equals(deletedMovie)) {
                counter += 1;
            }
            moviesArray[i] = moviesArray[(i + counter) % moviesArray.length];
        }
        moviesArray = Arrays.copyOfRange(moviesArray, 0, moviesArray.length - counter);
    }

    @Override
    public Movie[] findAll() {
        return moviesArray;
    }

    @Override
    public Movie findByTittle(String title) {
        for (Movie movie : moviesArray) {
            if (movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MovieRepository{" +
                " = " + Arrays.toString(moviesArray) +
                '}';
    }
}
