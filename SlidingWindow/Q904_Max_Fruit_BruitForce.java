package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

/**
 * Q904_Max_Fruit_BruitForce
 */
public class Q904_Max_Fruit_BruitForce {

    public static int maxFruit(int[] arr){

        int maxLen = 0;
        for(int i = 0; i<arr.length; i++){

            Set<Integer> basket = new HashSet<>();

            for(int j = i; j<arr.length;j++){

                basket.add(arr[j]);

                if(basket.size()<=2){
                    maxLen = Math.max(maxLen, j-i+1);

                }else{
                    break;
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2};
        System.out.println(maxFruit(arr));
    }
}