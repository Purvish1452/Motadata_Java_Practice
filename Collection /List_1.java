import java.util.*;
public class List_1{
    public static void main(String[] args)
    {
        List<String> it=new ArrayList<>();
        it.add("java");
        it.add("python");
        it.add("c++");
        it.add("javascript");
        it.add(0,"CPP"); //index 0 par value add karvamate
        System.out.println("Programming languages: "+it);
        for(String p:it)
        {
            System.out.println(p);
        }
        it.set(0,"C");  //value set  karvamate
        System.out.println(it.contains("java"));
        System.out.println(it);
        System.out.println(it.get(0));
        for(int i=0;i<it.size();i++)
        {
            System.out.println(it.get(i));
        }
        System.out.println(it.hashCode());
        List<Integer> it2=new ArrayList<>();
        it2.add(24);
        it2.add(23);
        it2.add(22);
        it2.add(21);
        it2.add(21);
        it2.add(null);
        it2.add(null);  
        System.out.println(it2);
        Collections.sort(it2,Comparator.nullsLast(Comparator.naturalOrder()));
        for(Integer p:it2)
        {
            System.out.println(p);
        }

        
    }
}