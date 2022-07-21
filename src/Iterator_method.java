import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_method {
    public static void main(String[] args) {
        ArrayList num = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            num.add(i);
        }
        System.out.println(num);
        Iterator itr = num.iterator();
        while (itr.hasNext())
        {
            int I =(int) itr.next();
            // to print odd numbers
            if(I %2 != 0)
                System.out.println(I);
            else{
                itr.remove();
            }
        }
        System.out.println(num);
    }
}
