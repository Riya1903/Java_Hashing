import java.util.*;
public class HashMapIterate {
    public static void main(String[] args) {
    HashMap<String,Integer>hm= new HashMap<>();
    //insert
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);
    hm.put("Nepal", 5);
    hm.put("Indonesia", 6);
//iterate
Set<String> keys=hm.keySet();
System.out.println(keys);
for(String k:keys)
{
    System.out.println("keys= "  + k+"value= "+ hm.get(k));
}

    }
}
