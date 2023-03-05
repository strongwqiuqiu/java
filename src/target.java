import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class target {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int target = 10;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int goal = target - nums[i];
            if (map.containsKey(goal)){
            }else {
                map.put(nums[i],i);
            }
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == goal && j != i){
                    int[] a = new int[2];
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
    }
}
