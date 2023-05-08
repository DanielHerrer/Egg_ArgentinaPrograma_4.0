package utilities;

import java.util.Comparator;
import java.util.Map;

public class Comparadores {
    
    public static Comparator<Map.Entry<Integer,String>> ordernarAZ = new Comparator<Map.Entry<Integer,String>>(){
        @Override
        public int compare(Map.Entry<Integer,String> o1, Map.Entry<Integer,String> o2) {
            return o1.getValue().compareTo(o2.getValue());
        }
    };

}
