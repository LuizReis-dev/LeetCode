import java.util.Map;
import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valuePosition = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int expectedValue = target - nums[i];
            
            if(valuePosition.containsKey(expectedValue)){
                return new int[]{valuePosition.get(expectedValue), i};
            }
            
            valuePosition.put(nums[i], i);
        }
        return null;
    } 

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        twoSum(nums, target);
    }
}