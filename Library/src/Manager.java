import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manager
{
    private int passWord;
    public User[] Users;

    Manager(int pass)
    {
        passWord = pass;
    }





    public void addUser(User user)
    {
        List<User> list = new ArrayList<User>(Arrays.asList(Users));
        list.add(user);
        Users = list.toArray(Users);
    }



}
