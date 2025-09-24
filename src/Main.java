//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] prefix = new int[nums.length];

//        Алгоритм:
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++){
            prefix[i] = nums[i] + prefix[i-1];
        }
    }
}