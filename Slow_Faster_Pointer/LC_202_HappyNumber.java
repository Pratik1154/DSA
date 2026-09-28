package Slow_Faster_Pointer;

public class LC_202_HappyNumber {

    public static int sumOfSquare(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n/=10;
            sum+=rem*rem;
        }
        return sum;
    }

    public static boolean isHappyNumber(int n){
        int slow = n;
        int fast = n;

        while(fast!=1){
            slow = sumOfSquare(slow);
            fast = sumOfSquare(sumOfSquare(fast));
            
            if(slow==fast && slow!=1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n =19;
        if(isHappyNumber(n)) System.out.println("Yes");
        else System.out.println("No");
    }
}
