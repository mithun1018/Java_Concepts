package Phase_2;

public class Book {
    private String title;
    private String author;
    private String isbn;
//    private int count;
    private boolean bookAvailability=true;
    public Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
//        this.count=count;
    }


    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }

    public String getTitle() {
        return title;
    }

    public void setBookAvailability(boolean bookAvailability) {
        this.bookAvailability = bookAvailability;
    }

    public boolean isBookAvailability() {
        return bookAvailability;
    }
}
