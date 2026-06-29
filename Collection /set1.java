import java.util.*;
public class set1 {
    public static void main(String[] args)
    {
        //The set interface does not allow duplicate elements.
        // It can contain at most one null value except TreeSet implementation which does not allow null.
        // The set interface provides efficient search, insertion, and deletion operations.
        Set<String> it=new HashSet<>();
        it.add("jay");
        it.add("mahakaal");
        it.add("jay mahakaal");
        it.add("jay");
        System.out.println(it);
        it.remove("mahakaal"); //removes the element "mahakaal" from the set
        System.out.println(it);
        System.out.println(it.size()); //returns the number of elements in the set
        System.out.println(it.contains("jay")); //returns true if the set contains the element "
        for(String s:it)
        {
            System.out.println(s);
        }

    }
}
