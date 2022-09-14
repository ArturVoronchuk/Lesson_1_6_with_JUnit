import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String bookName;   // название книги
    private String genre;      // жанр
    private Authors author;    // ФИО автора получаем из класса Authors
    private int numberVolumes; // количество томов
    private int numberPages;   // количество страниц
    private int fontSize;      // размер шрифта

    @Setter(AccessLevel.NONE)
    private double rating;     // рейтинг среди читателей(среднее арифметическое)

    static int totalBook;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int countVotes;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int voters;

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
     * @param grade оценка книги пользователем (от 0 до 5)
     */
    public double estimate(int grade) {
        if(grade > 0 && grade <= 5){
            voters++;
            countVotes += grade;
            rating = ((double) countVotes) / voters;
        }
        return rating;
    }
}