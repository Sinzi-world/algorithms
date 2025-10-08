package solutions.two_pointers;

public class Solution5 {

    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(s);
    }

    public static void reverseString1(char[] s) {
        StringBuilder builder = new StringBuilder();
        for (char ch: s){
            builder.append(ch);
        }
        String s1 = builder.reverse().toString();
        System.out.println(s1);
    }

    public static void main(String[] args) {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] s1 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s);
        reverseString1(s1);
    }
}
