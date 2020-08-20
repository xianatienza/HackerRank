package hackerrank.datastructures;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapPractice {

    public static void main(String[] args) {
        sortAHashMapPractice();
    }

    private static HashMap sortHashMap(Map unsorted) {
        final HashMap sortedHashMap = new LinkedHashMap();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(unsorted.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> t1) {
                return stringIntegerEntry.getValue().compareTo(t1.getValue());
            }
        });

        entryList.iterator().forEachRemaining((entry) -> sortedHashMap.put(entry.getKey(), entry.getValue()));

        return sortedHashMap;
    }

    public static void sortAHashMapPractice() {

        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Christian", 1);
        ageMap.put("Zyra", 2);
        ageMap.put("Zac", 3);

       ageMap.entrySet().iterator().forEachRemaining((entry) -> System.out.println(entry));

       ageMap = sortHashMap(ageMap);
        ageMap.entrySet().iterator().forEachRemaining((entry) -> System.out.println(entry));
    }
}
