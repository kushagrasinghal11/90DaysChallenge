package DSA.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersactionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                ans.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i); // unboxing Integer to int
        }

        return result;
    }
}
