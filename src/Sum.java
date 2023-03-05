public class Sum {
    public static void main(String[] args) {

        int[] nums = new int[4];
        for (int i = 0; i < nums.length; i++) {
            if (i >= 1){
                nums[i] += nums[i-1];
            }
        }
    }
}
