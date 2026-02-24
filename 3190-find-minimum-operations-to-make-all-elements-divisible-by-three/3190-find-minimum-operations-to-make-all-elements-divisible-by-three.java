class Solution {
    public int minimumOperations(int[] nums) {
        int s=0;
        for(int i:nums){
            if(i%3!=0) s++;
        }
        return s;
    }
}