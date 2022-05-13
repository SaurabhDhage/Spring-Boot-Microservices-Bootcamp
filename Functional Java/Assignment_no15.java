import java.util.ArrayList;
import java.util.List;
import com.github.javafaker.Faker;

public class Assignment_no15 {
    public static void main(String[] args) {
        Faker faker = new Faker();
        List<Books> ls = new ArrayList<>();
        String[] randGenre = {"Comic", "Non-Fiction", "Fiction", "Horror"};
        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 4);
            String name, author, genre;
            int sold;
            name = faker.name().firstName();
            genre = randGenre[num];
            author = faker.address().city();
            sold = Integer.parseInt(faker.number().digits(4));
            Books books = new Books();
            books.setBook(name, author, genre, sold);
            ls.add(books);
        }
        // a
        System.out.println("Highest number of books sold is by :");
        Books b1 =
                ls.stream().reduce((books1, books2) -> books1.sold > books2.sold ? books1 : books2).get();
        b1.getBook();
        // b
        long num =
                ls.stream().filter(books1 -> books1.genre.equals("Non-Fiction")).count();
        System.out.println("Number of authors who wrtie non-finctional book : " + num);

        // c
        System.out.println("Books sold more then 5000 copies");
        ls.stream().filter(book1 -> book1.sold > 5000).forEach(Books::getBook);



    }

    public static class Books {
        String name, author, genre;
        int sold;

        public void setBook(String name, String author, String genre, int sold) {
            this.name = name;
            this.author = author;
            this.genre = genre;
            this.sold = sold;
        }

        public void getBook() {

            System.out.println("Phone name = " + name + "\t" + "Author name = " + author);
            System.out.println("genre = " + genre + "\t" + "Total Sold = " + sold);
        }


    }
}
