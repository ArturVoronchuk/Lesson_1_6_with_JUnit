import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    private Book warAndPeace;

    @BeforeEach
    void setUp(){
        Authors author = new Authors("Лев", "Толстой");
        warAndPeace = new Book("Война и мир", "роман", author, 4, 1300, 10);
    }

    @Test
    @DisplayName("Оценка книги подходящей под диапазон значениям 0 до 5.")
    void estimateIsOk() {
        double actual = warAndPeace.estimate(5);
        double expected = 5.0;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Оценка книги отрицательным значением")
    void estimateNegativeValueIsOk(){
        double actual = warAndPeace.estimate(-1);
        double expected = 0.0;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Оценка книги значением превышающим диапазон")
    void estimateMoreThenGradeIsOk(){
        double actual = warAndPeace.estimate(6);
        double expected = 0.0;
        assertEquals(expected,actual);
    }
}