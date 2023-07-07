package collections.toys;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Product> toyMap = new HashMap<>();
        toyMap.put("Doll", new Product("Doll", 10));
        toyMap.put("Ball", new Product("Ball", 5));
        toyMap.put("Car", new Product("Car", 15));

        entrySet(toyMap);

        keySet(toyMap);

        values(toyMap);
    }

    public static void entrySet(HashMap<String, Product> map) {
        for (Map.Entry<String, Product> entry : map.entrySet()) {
            System.out.println("Toy: " + entry.getKey() + ", Object: " + entry.getValue());
        }
    }

    public static void keySet(HashMap<String, Product> map) {
        for (String key : map.keySet()) {
            System.out.println("Toy name: " + key);
        }
    }

    public static void values(HashMap<String, Product> map) {
        for (Product product : map.values()) {
            System.out.println("Toy object: " + product);
        }
    }

}
