package December;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Destination city
public class Problem_15 {
    public String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();
        for(List<String> path : paths){
            String src = path.get(0);
            cities.add(src);
        }

        String cityWithNoPath = "";
        for(List<String> path : paths){
            String dest = path.get(1);
            if(!cities.contains(dest)){
                cityWithNoPath = dest;
            }
        }
        return cityWithNoPath;
    }
}
