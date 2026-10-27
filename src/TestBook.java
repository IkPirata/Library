public class TestBook {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        Book anotherBook = new Book("more Java for dummy", new Author("Victor", "VictorBloqueadelegados@elmejor.com", 'm'), 29.95, 888);
        System.out.println(aBook);
        System.out.println(anotherBook);


        for (int i = 0; i < books.length; i++){
            books[i] = new Book("Book " + i , new Author("Sergi", "sergivamuy@avanzado.com",'m'), (15.99), (200 * i));
            System.out.println(books[i] + " for " + books[i].getPrice() + " stock " + books[i].getQtyInStock());
        }
    }
}
