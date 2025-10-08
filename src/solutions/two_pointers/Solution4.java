package solutions.two_pointers;

import java.util.HashSet;
import java.util.Set;

public class Solution4 {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(!set.contains(n)){
            set.add(n);
            n = getNextNumber(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }

    public static boolean isHappy1(int n) {
        int slow = n;
        int fast = n;

        while (slow != fast) {
            if (fast == 1) return true;
            slow = getNextNumber(slow);
            fast = getNextNumber(getNextNumber(fast));
        }

        return slow == 1;
    }

    private static int getNextNumber(int n) {
        int output = 0;

        while (n > 0) {
            int digit = n % 10;
            output += digit * digit;
            n = n / 10;
        }

        return output;
    }

    public static void main(String[] args) {
        int n = 19;
        int n2 = 2;
        System.out.println(isHappy(n));
        System.out.println(isHappy1(n));
        System.out.println(isHappy1(n2));
    }
}