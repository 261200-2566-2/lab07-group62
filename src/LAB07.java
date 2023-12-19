import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class LAB07 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Josh");
        set.add("Hutcherson");
        System.out.println(set.contains("Josh"));
        System.out.println(set.size());
        System.out.println(set);
        set.remove("Josh");
        System.out.println(set);

    }
}