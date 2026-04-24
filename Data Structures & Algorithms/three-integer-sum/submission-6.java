public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1, -1, 0 -> -1, 0, 1
        // -3, 0, 1, 2, 3
        // -1, 0, 0, 0, 1
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int l;
        int r;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if ( i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] > 0) {
                return result;
            }
            
            l = i + 1;
            r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    result.add(new ArrayList<>(List.of(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        return result;
    }
}