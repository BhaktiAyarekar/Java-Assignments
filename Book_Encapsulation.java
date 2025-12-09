public class Book_Encapsulation {

    private String title;
    private String author;

    public Book_Encapsulation(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    public static void main(String[] args) {
        Book_Encapsulation book = new Book_Encapsulation("Java Programming", "John Doe");

   
        book.displayInfo();

    
        book.setTitle("Advanced Java");

        System.out.println("\nAfter updating title:");
        book.displayInfo();
    }
}
