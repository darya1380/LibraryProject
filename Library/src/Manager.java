import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manager
{
    private int passWord;
    public Book[] Books;
    public User[] Users;

    Manager(int pass)
    {
        passWord = pass;
    }


    public void addBook(Book book)
    {
        List<Book> list = new ArrayList<Book>(Arrays.asList(Books));
        list.add(book);
        Books = list.toArray(Books);
    }

    public void addUser(User user)
    {
        List<User> list = new ArrayList<User>(Arrays.asList(Users));
        list.add(user);
        Users = list.toArray(Users);
    }

    public void removeBook(Book book)
    {
        List<Book> list = new ArrayList<Book>(Arrays.asList(Books));
        list.remove(book);
        Books = list.toArray(Books);
    }

}
