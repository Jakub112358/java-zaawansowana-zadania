package zad3;

// Zadanie 3
// Stwórz klasę movie z polami:
// - title
// - yearOfRelease
// oraz zaimplementuj wymagane metody.
// Stwórz interfejs MovieRepositoryApi który będzie deklarować podstawowe operacji na tablicy obiektów typu Movie:
// - add
// - delete
// - findAll
// - findByTitle
// Napisz implementację interfejsu MovieRepository, która będzie implementować metody z interfejsu MovieRepositoryApi
public class Movie {
    private String title;
    private int yearOfRelease;

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public Movie(String title, int yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease;
    }

    public boolean isEqual(Movie checkingMovie) {
        return (checkingMovie.getTitle().equals(title) || checkingMovie.getYearOfRelease() == yearOfRelease);
    }

}
