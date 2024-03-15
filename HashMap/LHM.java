import java.util.*;
public class LHM{
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        map.put("INDIA", 100);
        map.put("JAPAN", 79);
        map.put("NEPAL", 90);

        System.out.println(map);
    }
}