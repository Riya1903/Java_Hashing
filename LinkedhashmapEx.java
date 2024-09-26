import java.util.*;

public class LinkedhashmapEx {
public static void main(String[] args) {
    LinkedHashMap<String,Integer>lhm= new LinkedHashMap<>();
    //insert
    lhm.put("India", 100);
    lhm.put("China", 150);
    lhm.put("US", 50);
    System.out.println(lhm);
    //get-O(n)
    int population =lhm.get("India");
    System.out.println(population);
    //Containkey-O(n)
    System.out.println(lhm.containsKey("India"));
    System.out.println(lhm.containsKey("Indindonasia"));

    //remove-O(n)
    System.out.println(lhm.remove("US"));
    System.out.println(lhm);
    
}
}
