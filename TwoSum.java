import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static void main(String args[]) {
        int num[] = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(num,target)));
    }

    public static int[] twoSum(int num[], int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length; i++) {
            int req_num = target - num[i];
            if (hm.containsKey(req_num)) {
                int arr[] = { hm.get(req_num), i };
                return arr;
            }
            hm.put(num[i], i);
        }
        return null;
    }
}
