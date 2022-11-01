package zad3;

public interface MovieRepositoryApi {
    void add(Movie addedMovie);

    void delete(Movie deletedMovie);

    Movie[] findAll();

    Movie findByTittle(String title);
}
