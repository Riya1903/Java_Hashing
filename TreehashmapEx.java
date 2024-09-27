import java.util.*;

public class TreehashmapEx {
public static void main(String[] args) {
    TreeMap<String,Integer>hm= new TreeMap<>();
    //insert
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);
    System.out.println(hm);
    //get-O(n)
    int population =hm.get("India");
    System.out.println(population);
    //Containkey-O(n)
    System.out.println(hm.containsKey("India"));
    System.out.println(hm.containsKey("Indindonasia"));

    //remove-O(n)
    System.out.println(hm.remove("US"));
    System.out.println(hm);
    
}
}
