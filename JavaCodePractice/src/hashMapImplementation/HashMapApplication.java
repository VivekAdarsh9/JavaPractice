package hashMapImplementation;

import java.util.HashMap;
import java.util.Map;

public class HashMapApplication {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        hm.put(1, "vivek");
        hm.put(1, "Abhishek");

        // System.out.println(hm.keySet());
      //  System.out.println(hm.values());

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry);
        }

    }
}
