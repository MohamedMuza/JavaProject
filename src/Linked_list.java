import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Mumbai");
        addInOrder(placesToVisit,"Delhi");
        addInOrder(placesToVisit,"Hyderabad");
        addInOrder(placesToVisit,"kolkata");
        addInOrder(placesToVisit,"Agra");
        addInOrder(placesToVisit,"Darjeeling");
        addInOrder(placesToVisit,"Ladakh");
        addInOrder(placesToVisit,"Delhi");


        printList(placesToVisit);
        //new place chennai is added
        placesToVisit.add(1, "chennai");
        printList(placesToVisit);
        //index 4 hyderabad is removed
        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new City should appear before this one
                // Bangalore -> Agra
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } //else if (comparison < 0) {

            //}
        }
        stringListIterator.add(newCity);
        return true;
    }
}

