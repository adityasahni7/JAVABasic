package OOPS.OOPS1;
public class HelloWorld {
    public static void main(String[] args) {
        User User = new User("John","1990, 1, 1");
        Book book = new Book();
        book.title = "The Lord of the Rings";
        book.author = "J.R.R. Tolkien";
        User.borrow(book);
        System.out.printf("%s is %d years old \n", User.getName(), User.age());
        System.out.printf("%s has borrowed these books: %s \n", User.name, User.books.toString());
    }
}
