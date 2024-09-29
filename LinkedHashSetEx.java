import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
public static void main(String[] args) {
   LinkedHashSet<String>cities= new LinkedHashSet();
    //insert
    cities.add("delhi");
    cities.add("mumbai");
    cities.add("noida");
    cities.add("bengluru");
    cities.add("chennai");
    Iterator it=cities.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }
}
}