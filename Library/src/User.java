import org.omg.CORBA.BAD_CONTEXT;

import java.util.Scanner;

public class User
{
    private String  Name;
    private Integer ID;
    private Integer passWord;
    private boolean hasBorrowed;
    User(String name, Integer id, Integer pass)
    {
        Name = name;
        ID = id;
        passWord = pass;
        hasBorrowed = false;
    }

    public static void borrowBook(Book book)
    {
        if(book.doesExist())
             book.removeExist();
        else
            System.out.println("The Book is not available");
    }

    public User Intro()
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        int id;
        int pass;
        System.out.println("please enter your name");
        name = scanner.nextLine();
        System.out.println("Good, now please enter your id");
        id = scanner.nextInt();
        System.out.println("now please enter your password");
        pass = scanner.nextInt();
        User user = new User(name, id, pass);
        return user;
    }

    public static void giveBackBook(Book book)
    {
        book.addExist();
    }
}
