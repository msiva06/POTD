package December;

import java.util.List;

// Largest 3 same digit number in string
public class Problem_04 {
    public String largestGoodInteger(String num) {
         List<String> good = List.of("999","888","777","666","555","444","333","222","111","000");
        for(String g : good){
            for(int i = 0; i < num.length()-3+1; i++){
                String sub = num.substring(i,i+3);
                
                    if(g.equals(sub)){
                        return g;
                    }
            }
        }
        return "";
    }
}
