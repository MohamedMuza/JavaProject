import java.lang.*;
interface moon {
     void motion();
}
interface earth {
     void revolution();
}
interface solarSystem extends moon, earth{
     void revolution();
}

class Person implements solarSystem {
@Override public void revolution(){System.out.println("The Earth revolution to the sun is 365 days");}
    @Override public void motion()
     {
         System.out.println("Moon takes to 27.3 days to complete earth revolution");
     }

 }

 public class Inheritance{
    public static void main(String[] args)
    {
        Person obj1 = new Person();
        obj1.revolution();
        obj1.motion();
    }
}

