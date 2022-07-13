import java.util.Scanner;

public class For_each_loop {
    public static void main(String[] args) {
        wrapperClassUsing();
        String[] names = {"Java", "C", "C++", "Python", "JavaScript"};
        System.out.println("Printing the names of programming language: ");
        for (String Each_in : names) {
            System.out.println(Each_in);
        }
    }

    public static void wrapperClassUsing()
    {
        Integer Wrapper_int;
        Scanner scan= new Scanner(System.in);
        System.out.println("The Given integer value is : ");
        Wrapper_int=scan.nextInt();
        String myString = Wrapper_int.toString();
        System.out.println("The Length of the given integer is : " + myString.length() + "\n");
    }
}