package solutions;

public class Solution7 {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }

        int left = 0, right = sb.length() - 1;
        while(left < right){
            if(sb.charAt(left)!=sb.charAt(right)){return false;}
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "Человек, план, канал: Панама";
        System.out.println(isPalindrome(s));
    }
}