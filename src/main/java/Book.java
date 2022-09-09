public class Book<String> {
    String bookName;   // название книги
    String genre;      // жанр
    Authors author;    // ФИО автора получаем из класса Authors
    int numberVolumes; // количество томов
    int numberPages;   // количество страниц
    int fontSize;      // размер шрифта

    static int totalBook;

    private int countVotes;
    private int voters;
    private double rating;     // рейтинг среди читателей(среднее арифметическое)

    /**
     * @param bookName      название книги
     * @param genre         жанр
     * @param author        автор
     * @param numberVolumes количество томов
     * @param numberPages   количество страниц
     * @param fontSize      размер шрифта
     */
    public Book(String bookName, String genre, Authors author, int numberVolumes,
                int numberPages, int fontSize) {
        this.bookName = bookName;
        this.genre = genre;
        this.author = author;
        this.numberVolumes = numberVolumes;
        this.numberPages = numberPages;
        this.fontSize = fontSize;
        totalBook++;
    }

    public Book(String bookName, String genre, Authors author, int numberPages, int fontSize) {
        this(bookName, genre, author, 1, numberPages, fontSize);
    }

    /**
     * Оценить книгу
     *
     * @param grade оценка книги пользователем
     */
    public void estimate(int grade) {
        voters++;
        countVotes += grade;
        rating = ((double) countVotes) / voters;
    }

    public double getRating() {
        return rating;
    }
}