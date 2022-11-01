package zad3;

import java.util.Arrays;

public class MovieTest {
    public static void main(String[] args) {

        Movie movieToDelete = new Movie("The Shawshank Redemption", 1994);
        Movie movieToAdd = new Movie("Gone with the Wind", 1939);

        MovieRepository movieRepository = new MovieRepository(new Movie[]{new Movie("The Terminator", 1984),
              //  movieToDelete,
                new Movie("The Shawshank Redemption", 1994),
                new Movie("LOTR: The Two Towers", 2002),
                new Movie("The Shawshank Redemption", 1994)});
              //  movieToDelete});

        System.out.println(movieRepository);

        movieRepository.delete(movieToDelete);
        System.out.println(movieRepository);

        movieRepository.add(movieToAdd);
        System.out.println(movieRepository);

        Movie[] moviesArray = movieRepository.findAll();
        System.out.println(Arrays.toString(moviesArray));

        Movie terminatorMovie = movieRepository.findByTittle("The Terminator");
        System.out.println(terminatorMovie);


    }


}
