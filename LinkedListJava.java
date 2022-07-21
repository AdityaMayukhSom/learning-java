import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListJava {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);
        addInOrder(placesToVisit, "Alice Springs");
        printList(placesToVisit);
        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " -> ");
        }
        System.out.println();
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                return false;
            } else if (comparison > 0) {
                // new city should appear before this one.
                // Brisbane is city, and Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else {
                // Move On To The Next City
            }
        }
        // We have gone through the entire list and not found any suitable place.
        // hence to have to add the city at the end of the list
        stringListIterator.add(newCity);
        return true;
    }
}