import java.util.Scanner;

public class Calculator {
    int x = 10;
    public static int Sum(int a,int b)
    {
        return(a+b);
    }
    public int Sub(int a,int b)
    {
        return(a-b);
    }

    public static void main(String[] args) {
        Calculator myObj = new Calculator();
        //overriding a variable
        myObj.x = 25;
        System.out.println(myObj.x);
        //Scanning input
        Scanner scan = new Scanner(System.in);
        int[] var = new int[4];
        System.out.println("Enter the values of an array : ");
        for(int i = 0; i <= var.length-1; i++)
            var[i] = scan.nextInt();
        //First two values taken for add
        //static function call
        System.out.println("The sum of two numbers is : " + Sum(var[0],var[1]));
        //Second two values taken for sub
        //object function call
        System.out.println("The subtraction of two numbers is: " + myObj.Sub(var[2], var[3]));

    }
}
