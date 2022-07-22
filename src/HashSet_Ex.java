import java.util.*;
public class HashSet_Ex{
    public static void main(String args[]){
        HashSet<String> set0=new HashSet<String>();
        set0.add("Nayma");
        set0.add("Muzammil");
        set0.add("Vivek");
        set0.add("Narendran");
        System.out.println("First hashset contents : "+set0);
        //Removing specific element from HashSet
        set0.remove("Vivek");
        System.out.println("After a object remove in first hashset : "+set0);
        HashSet<String> set1=new HashSet<String>();
        // Adding same name Muzammil
        set1.add("Muzammil");
        set1.add("Mohamed");
        set1.add("Kiran");
        System.out.println("Second hashset contents : " + set1);
        //Adding set with set1
        set0.addAll(set1);
        System.out.println("Added the first and second hashset : "+set0);
        //Removing all the new elements from HashSet
        set0.removeAll(set1);
        System.out.println("After removing second hashset : "+set0);
        //Removing specific elements
        set0.removeIf(name->name.contains("Narendran"));
        System.out.println("After invoking removeIf() method: "+set0);
        //Removing all the elements available in the set
        set0.clear();
        System.out.println("After invoking clear() method: "+set0);
    }
}