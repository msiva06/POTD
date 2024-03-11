package March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Intersection of two arrays
public class Problem_10 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> n1 = new HashSet<>();
        for(int num : nums1){
            n1.add(num);
        }

        Set<Integer> n2 = new HashSet<>();
        for(int num : nums2){
            n2.add(num);
        }

        if(n1.size() < n2.size()){
            return intersection(n1,n2);
        }
        else{
            return intersection(n2,n1);
        }

    }

    public static int[] intersection(Set<Integer> num1, Set<Integer> num2){
        int[] res = new int[num1.size()];
        int idx = 0;
        for(Integer n1 : num1){
            if(num2.contains(n1)){
                res[idx] = n1;
                idx++;
            }
        }
        return Arrays.copyOf(res,idx);
    }
}
