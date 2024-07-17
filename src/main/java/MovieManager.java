import org.example.PosterMovie;

public class MovieManager {
    private int limit = 10;
    private PosterMovie[] movies = new PosterMovie[0];


    public MovieManager() {

    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public PosterMovie[] findAll() {
        return movies;
    }

    public void save(PosterMovie movie) {
        PosterMovie[] tmp = new PosterMovie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public PosterMovie[] findLast() {

        int resultLength;
        if (limit == movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = getLimit();
        }

        PosterMovie[] result = new PosterMovie[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = findAll()[resultLength - 1 - i];
        }
        return result;
    }

    public PosterMovie[] findLast2() {

        int resultLength;
        if (limit == movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = getLimit();
        }

        PosterMovie[] result = new PosterMovie[movies.length - (movies.length - resultLength)];
        for (int i = 0; i < resultLength; i++) {
            result[i] = findAll()[movies.length - 1 - i];
        }
        return result;
    }


}

