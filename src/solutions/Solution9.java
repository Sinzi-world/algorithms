package solutions;

public class Solution9 {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String operation:operations){
            if(operation.equals("++X") || operation.equals("X++")) x+=1;
            else x-=1;
        }
        return x;
    }

    public static void main(String[] args) {
        String[] ss = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(ss));
    }
}
