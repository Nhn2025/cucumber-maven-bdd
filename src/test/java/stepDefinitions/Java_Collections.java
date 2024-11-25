package stepDefinitions;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class Java_Collections {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Java");
        myMap.put(2, "JavaFX");
        myMap.put(3, "CoffeeScript");
        myMap.put(4, "TypeScript");

        ArrayList<String> valueList = new ArrayList<>(myMap.values());
        System.out.println(valueList);

        // [Java, JavaFX, CoffeeScript, TypeScript]
        // 0 1 2 3
        System.out.println(valueList.get(0));
        System.out.println(valueList.get(1));
        System.out.println(valueList.get(2));

        for (String value : valueList) {
            System.out.println(value);
        }
    }

}
