package SlidingWindow;

import java.util.HashMap;
// import java.util.HashSet;
import java.util.Map;
// import java.util.Set;

/**
 * Q904_Max_Fruit_BruitForce
 */
public class Q904_Max_Fruit_BruitForce_Opt {

    public static int maxFruit(int[] fruits ){

        int left = 0, right = 0, maxLen = 0;
        Map<Integer, Integer> basket = new HashMap<>();

        while(right<fruits.length){
            basket.put(fruits[right],basket.getOrDefault(fruits[right],0)+1);

            while (basket.size()>2) {
                basket.put(fruits[left],basket.get(fruits[left])-1);
                if(basket.get(fruits[left])==0){
                    basket.remove(fruits[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2};
        System.out.println(maxFruit(arr));
    }
}