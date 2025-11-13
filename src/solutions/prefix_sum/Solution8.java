package solutions.prefix_sum;

class Solution8 {
    public static String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;
        String vowels = "aeiouAEIOU";
        char[] chs = s.toCharArray();
        while(left < right){
            if(vowels.indexOf(chs[left]) == -1) left++;
            if(vowels.indexOf(chs[right]) == -1) right--;

            if(vowels.indexOf(chs[left]) != -1 && vowels.indexOf(chs[right]) != -1){
                char temp = chs[left];
                chs[left] = chs[right];
                chs[right] = temp;
            }
            left++;
            right--;
        }
        return new String(chs);
    }

    public static String reverseVowels1(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }

            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }

            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }
        return new String(word);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
        System.out.println(reverseVowels1(s));
    }
}