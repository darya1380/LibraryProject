import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book
{
    private String Name;
    private String Author;
    private boolean Exist;
    public Book[] Books;
    Book(String name, String author)
    {
        Name = name;
        Author = author;
        Exist = true;
    }
    public void removeExist()
    {
        this.Exist = false;
    }
    public void addExist()
    {
        this.Exist = true;
    }
    public boolean doesExist()
    {
        return this.Exist;
    }
    public boolean Exists()
    {
        boolean res = false;
        for (Book value : Books)
            if (value == this) {
                res = true;
                break;
            }
        return res;
    }

    public void removeBook(Book book)
    {
        List<Book> list = new ArrayList<Book>(Arrays.asList(Books));
        list.remove(book);
        Books = list.toArray(Books);
    }

    public void addBook(Book book)
    {
        List<Book> list = new ArrayList<Book>(Arrays.asList(Books));
        list.add(book);
        Books = list.toArray(Books);
    }

}
