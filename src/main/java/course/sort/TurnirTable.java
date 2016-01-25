package course.sort;

import java.util.*;

/**
 * @author trierra
 * @date 12/14/15.
 */
public class TurnirTable {
    static Map<String, Integer> classMap = new HashMap<String, Integer>();
    static SortedMap<Integer, String > turnir = new TreeMap<Integer, String>();

    static {
        classMap.put("Guzel", 0);
        classMap.put("Alex", 0);
        classMap.put("Alex P", 0);
        classMap.put("Alex R", 0);
        classMap.put("Ira", 0);
        classMap.put("Natasha", 0);
        classMap.put("Lena", 0);
        classMap.put("Katya", 0);
        classMap.put("Max", 0);
        classMap.put("Nastya", 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[classMap.size()];

        for (String key : classMap.keySet()){
            System.out.println("enter scores for " + key);
            turnir.put(in.nextInt(), key);
        }

        for (int i = 0; i < classMap.size(); i++) {
            System.out.println();
        }
    }

}
