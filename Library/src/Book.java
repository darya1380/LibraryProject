public class Book
{
    private String Name;
    private String Author;
    private boolean Exist;
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

}
