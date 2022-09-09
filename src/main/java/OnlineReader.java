public class OnlineReader {

    public static void main(String[] args) {

        Authors levTolstoy = new Authors("Лев", "Толстой");

        Book warAndPeace = new Book("Война и мир", "роман", levTolstoy, 4, 1300, 10);
        Book garnetBracelet = new Book("Грана́товый брасле́т", "повесть",  new Authors("Александр", "Куприн"), 160, 9);

        // выставляем рейтинги книгам
        warAndPeace.estimate(5);
        warAndPeace.estimate(5);
        warAndPeace.estimate(3);
        warAndPeace.estimate(4);
        warAndPeace.estimate(5);

        garnetBracelet.estimate(4);
        garnetBracelet.estimate(4);
        garnetBracelet.estimate(5);
        garnetBracelet.estimate(4);
        /*  к статическим методам обращаемся через имя класса;
         *  к нестатическим методам обращаемся через имя объекта класса;
         */

        System.out.println("Всего книг в библиотеке: " + Book.totalBook);

        System.out.println("Рейтинги книг: ");
        System.out.println(warAndPeace.author + " " + warAndPeace.bookName + " рейтинг книги среди читателей "
                + warAndPeace.getRating());
        System.out.println(garnetBracelet.author + " " + garnetBracelet.bookName + " рейтинг книги среди читателей "
                + garnetBracelet.getRating());

        User arturVoronchuk = new User("Артур", "Ворончук", "a.voronchuk@pochta.ru");
        User margotRobbie = new User("Марго", "Робби", "MargoEliseRobbie@yandex.ru");
        User jasonStatham = new User("Джейсон", "Стэтхэм", "JS@bk.ru");
        System.out.println("\nКоличество пользователей онлайн: " + User.totalOnline);
    }
}