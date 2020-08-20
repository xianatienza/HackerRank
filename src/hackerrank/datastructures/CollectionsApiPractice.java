package hackerrank.datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsApiPractice {

    public static void main(String[] args) {
        //tryVector();
        //tryHashSet();
        //tryLinkedHashSet();
        tryTreeSet();
    }

    public static void tryVector() {

        Vector<String> l = new Vector<String>();
        l.add("A");
        l.add("B");

        for (String s : l) {
            System.out.println(s);
        }

    }

    public static void tryHashSet() {

        HashSet hSet = new HashSet<>();
        hSet.add("A");
        hSet.add("B");
        hSet.add(null);

        hSet.iterator().forEachRemaining(val -> System.out.println(val));

    }

    public static void tryLinkedHashSet() {

        LinkedHashSet<String> lSet = new LinkedHashSet<>();
        lSet.add("B");
        lSet.add("A");
        lSet.add("C");

        lSet.iterator().forEachRemaining(val -> System.out.println(val));

    }


    public static void tryTreeSet() {

        TreeSet tSet = new TreeSet();
        tSet.add("C");
        tSet.add("X");
        tSet.add("A");

        tSet.iterator().forEachRemaining( val -> System.out.println(val));
    }
}
