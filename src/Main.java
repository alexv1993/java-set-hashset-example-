import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Long> set = new HashSet<Long>();
        set.add(10L);

        Iterator<Long> iterator = set.iterator();
        while (iterator.hasNext()) {
            Long lng = iterator.next();
            System.out.println(lng);
        }
        if (set.contains(10)) {
            // we won't get here!
            System.out.println("Contains");
        }

    }
}
