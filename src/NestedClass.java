class OuterClass
{
    // static member
    static int firstNum = 10;
    // instance(non-static) member
   static int secondNum = 20;
    private static int outer_private = 30;
    // static nested class
    static class StaticNestedClass
    {
        void show()
        {
            // can access static member of outer class
            System.out.println("Addition of two Num = " + (int)(firstNum+secondNum));
            // can access show private static member of outer class
            System.out.println("Division of two numbers = " + outer_private/firstNum);
        }
    }
}

// Driver class
public class NestedClass
{
    public static void main(String[] args)
    {
        // accessing a static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.show();
    }
}