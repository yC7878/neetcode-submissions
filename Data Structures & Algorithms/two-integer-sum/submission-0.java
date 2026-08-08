class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> differentNeed = new HashMap<>();

        for(int i = 0; i < nums.length;i++){
            int different = target - nums[i];
            if(differentNeed.containsKey(different)){
                int[] output = new int[2];
                output[0] = (differentNeed.get(different));
                output[1] = i;
                return output;
            }else{
            differentNeed.put(nums[i], i);            }
        }
                return new int[]{};

        
    }
}
