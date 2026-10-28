package Arrays;

import java.util.HashMap;

/**
 * LL_169_Majority_Element
 */
public class LL_169_Majority_Element {

     public static  int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap();
        int major = nums.length/2;
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int res=0;
        for(Integer key:map.keySet()){
            if(map.get(key)>major){
                res=key;
            }
        }
        return res;
        
    }
    public static void main(String[] args) {
        int[] num = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(num));
    }
}