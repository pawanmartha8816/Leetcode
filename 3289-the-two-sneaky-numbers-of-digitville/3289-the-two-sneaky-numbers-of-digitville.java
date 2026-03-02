class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[]  res=new int[2];
        TreeMap<Integer,Integer> t=new TreeMap<>();
        for(int i:nums){
            if(t.containsKey(i)) t.put(i,t.get(i)+1);
            else t.put(i,1);
        }
        int i=0;
        for(Map.Entry<Integer,Integer> entry:t.entrySet()){
            if(entry.getValue()==2
            ){
                res[i]=entry.getKey();
                i++;
            }
        }
        return res;
    }
}