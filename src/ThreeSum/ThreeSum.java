package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;  i < nums.length - 3; i++) {
            if(i == 0 || nums[i] > nums[i-1]) {
                int start = i + 1;
                int end = nums.length - 1;
                while(start < end) {
                    if(nums[start] + nums[end] + nums[i] == 0) {
                        List<Integer> newList = new ArrayList<>();
                        newList.add(nums[i]);
                        newList.add(nums[start]);
                        newList.add(nums[end]);
                        result.add(newList);
                    }
                    if(nums[start] + nums[end] + nums[i] > 0) {
                        int currentEnd = end;
                        while(nums[end] == nums[currentEnd] && end > start){
                            end--;
                        }
                    } else{
                        int currentStart = start;
                        while(nums[start] == nums[currentStart] && start < end) {
                            start++;
                        }
                    }
                }
            }
        }
        if(nums.length == 3 && nums[0] + nums[1] + nums[2] == 0){
            List<Integer> newList = new ArrayList<>();
            newList.add(nums[0]);
            newList.add(nums[1]);
            newList.add(nums[2]);
            result.add(newList);
        }
        return result;
    }
}
