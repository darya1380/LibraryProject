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

    private boolean alreadyBorrowed()
    {
        return this.hasBorrowed;
    }

    public void borrowBook()
    {
        System.out.println("enter your book name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("enter the author");
        String authorName = scanner.nextLine();
        Book toBorrow = new Book(name, authorName);
        if(toBorrow.doesExist() && toBorrow.Exists())
        {
            if(!alreadyBorrowed())
            {
                System.out.println("your book was borrowed successfully");
                toBorrow.removeExist();
            }
            else
            {
                System.out.println("you have already borrowed a book");
                System.out.println("return it first");
            }

        }
        else
            System.out.println("book is not available at the moment");
        Main.userMenu(this);

    }

    public void giveBackBook()

    {
        System.out.println("please enter the book name which you are returning");
        System.out.println("and enter the name of the author");
        Scanner scanner = new Scanner(System.in);
        Book givenBack = new Book(scanner.nextLine(), scanner.nextLine());
        if(!givenBack.doesExist())
        {
            System.out.println("thank you! :)");
            this.hasBorrowed = false;
        }
        else
        {
            System.out.println("an unknown error was accrued");
        }
    }
}
