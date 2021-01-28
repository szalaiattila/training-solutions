package attributes.book.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Eszter hagyatéka");
        System.out.println(book.getTitle());

        book.setTitle("1939");
        System.out.println(book.getTitle());
    }
}
