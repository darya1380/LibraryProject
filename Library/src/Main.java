import java.awt.*;
import java.util.Scanner;

public class Main
{
    private static User Intro()
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
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Welcome to the library");
        System.out.println("1) creat user");
        int input = scanner.nextInt();
        switch (input)
        {
            case 1: User user = Intro();
            userMenu(user);
            break;
            default: break;
        }

    }

    public static void userMenu(User user)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Borrow Book");
        System.out.println("2) Give back Book");
        int input = scanner.nextInt();
        switch (input)
        {
            case 1: user.borrowBook();
            break;
            case 2: user.giveBackBook();
            break;
        }
    }
}
