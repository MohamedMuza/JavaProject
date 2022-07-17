public class Exceptional_handling {
    public static void main(String args[]){
        try{
            int x=1;
            int y=0;
            int z = x/y;
        }catch(Exception z)
        {System.out.println("Divisible by zero");}
        finally {
            System.out.println("finally code is executed");
        }
        System.out.println("rest of the code...");
    }
}

