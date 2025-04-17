import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        //create iterator obj
        Iterator<String> namesIterator = names.iterator();

        // loop through names list using iterator object
        System.out.println("Using Iterator:");
        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
        }
    }
}