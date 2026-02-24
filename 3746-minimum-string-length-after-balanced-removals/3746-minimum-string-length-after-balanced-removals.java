import java.util.TreeMap;
class Solution {
    public int minLengthAfterRemovals(String s) {
        TreeMap<Character,Integer> t=new TreeMap<>();
        for(char ch : s.toCharArray()){
            if(t.containsKey(ch)) t.put(ch,t.get(ch)+1);
            else t.put(ch,1);
        }
        int[] arr=new int[2];
        int s1=0;
        for(Map.Entry<Character,Integer> entry:t.entrySet()){
            arr[s1++]=entry.getValue();
        }
        return Math.abs(arr[0]-arr[1]);
    }
}