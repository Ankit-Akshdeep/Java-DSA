import java.util.*;
public class First{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();     
        
        //insert
        map.put("INDIA", 500);
        map.put("USA", 300);
        map.put("France", 450);

        System.out.println(map);

        //get
       int pop =  map.get("INDIA");
        System.out.println(pop);

        //contains
        System.out.println(map.containsKey("BHUTAN"));

        //remove
        System.out.println(map.remove("USA"));

        //size
        System.out.println(map.size());
    }
}