import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetEx {
public static void main(String[] args) {
    TreeSet<String>cities= new TreeSet<>();
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
