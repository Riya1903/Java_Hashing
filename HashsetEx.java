import java.util.*;

public class HashsetEx {
public static void main(String[] args) {
    HashSet<Integer>set= new HashSet<>();
    //insert
    set.add(1);
    set.add(2);
    set.add(5);
    set.add(2);
    set.add(1);
    System.out.println(set);
    
    
    
    if(set.contains(2))
    {
    System.out.println("set contain 2");
    }
    if(set.contains(1)){
    System.out.println("set contain 1");
    }

    //remove-O(n)
    System.out.println(set.size());
    set.clear();
    System.out.println(set.size());
    
}
}
