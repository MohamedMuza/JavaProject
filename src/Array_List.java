import java.util.*;

class Array_List {
    public static void main(String[] args) {
        List<String> lang = new  ArrayList<>();
        lang.add("English");
        lang.add("German");
        lang.add(1,"French");
        lang.add("urdu");
        String firstLang = lang.get(0);
        lang.get(0);
        System.out.println(firstLang);
        System.out.println("The List of Languages : "+ lang);
        lang.remove(1);
        System.out.println("Updated languages : " +lang);
        System.out.println("First language in list is : " +firstLang);

        //Traversing list through Iterator
        Iterator itr=lang.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

