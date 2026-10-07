package Arrays;

public class SecondLargest {
    public static int secondLargest(int[] arr){
        if(arr==null || arr.length<2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num != largest) secondLargest = num;
        }
        return (secondLargest==Integer.MIN_VALUE)?-1:secondLargest;
    }

    public static void main(String[] args) {
        int[] test1 = {12, 35, 1, 10, 34, 1};
        int[] test2 = {10, 10, 10};
        int[] test3 = {5};

        System.out.println(secondLargest(test1));
        System.out.println(secondLargest(test2));
        System.out.println(secondLargest(test3));

        
    }
}
