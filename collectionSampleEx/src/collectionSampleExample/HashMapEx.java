package collectionSampleExample;

import java.util.HashMap;

public class HashMapEx {

	 public static void main(String[] args) {

	        HashMap<Integer, String> map = new HashMap<>();

	        map.put(1, "Java");
	        map.put(2, "Python");
	        map.put(3, "C++");
	        map.put(2, "JavaScript"); // duplicate key

	        System.out.println(map);
	    }
}
