
class Main {
     String Add(String a, String b)
    {

        // Return product
        return a + b;
    }


    int Add(int a, int b)
    {

        // Return product
        return a + b;
    }
}

// Class 2
// Main class
class Polymorphism {
    // Main driver method
    public static void main(String[] args)
    {
        // Calling method by passing
        // input as in arguments
        Main obj1 = new Main();
        System.out.println(obj1.Add(2, 4));
        System.out.println(obj1.Add("Mohamed"," Muzammil"));
    }
}