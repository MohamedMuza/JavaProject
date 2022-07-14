
class animals
{
    public animals()
    {
        System.out.println("in parent animals constructor");
    }
    public animals(int i)
    {
        System.out.println("in animals parameterized constructor");
    }
}
class Dog extends animals
{
    public Dog()
    {
        //super();
        System.out.println("in child constructor Dog");
    }
    public Dog(int i)
    {
        //To call parameterized child class super keyword is used
        super(5);
        System.out.println("in child parameterized constructor");
    }

}

public class Super {
    public static void main (String[] args)
    {
       Dog  obj1 = new Dog(3);
    }
}
