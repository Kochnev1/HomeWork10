public class FilmsManager {
    private String[] films = new String[0];
    private int limit = 5;

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public FilmsManager() {
    }

    public void addFilm(String newFilm) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];

        }

        tmp[tmp.length - 1] = newFilm;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLenght;
        if (limit < films.length) {
            resultLenght = limit;
        } else {
            resultLenght = films.length;
        }

        String[] result = new String[resultLenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];

        }

        return result;
    }
}