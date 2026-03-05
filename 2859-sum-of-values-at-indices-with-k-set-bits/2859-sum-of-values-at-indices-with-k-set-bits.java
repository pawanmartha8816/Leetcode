class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s=0;
        for(int i=0;i<nums.size();i++){
            if(k==(bit(i))){
                s+=nums.get(i);
            }
        }
        return s;
    }
    public int bit(int n){
        int c=0;
        while(n!=0){
            c++;
            n=n&(n-1);
        }
        return c;
    }
}