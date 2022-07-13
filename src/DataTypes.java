public class DataTypes {
    public static void main(String[] args)
    {
        boolean a =true;
        if(a ==true)
        { System.out.println("Boolean value");}
        byte b=126;
        b+=3;
        //byte gets negative above 128
        System.out.println("byte value is :" + b);
        short c = 32766;
        //max size of short is 32767
        System.out.println("short value is :" + c);
        int d=2324567;
        //max int value is 2,147,483,647
        System.out.println("int value is :" + d);
        long e = 1234567890;
        //long is 8 bytes
        System.out.println("long value is :" + e);
        float f = 10.67f;
        //float is 4 bytes
        System.out.println("float value is :" + f);
        double g = 21.567d;
        //double is 8 bytes
        System.out.println("double value is :" + g);
        char h ='M';
        System.out.println("Character value is :" + h);
        //Non primitive datatype
        String i ="Mohamed_Muzammil";
        System.out.println("String value is :" + i);
    }
}
