class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> checkDuplicate = new ArrayList<Integer>();

        for(int num: nums){
            if(checkDuplicate.contains(num)){
                return true;
            }else{
                checkDuplicate.add(num);
            }
        }
        return false;
        
    }
}