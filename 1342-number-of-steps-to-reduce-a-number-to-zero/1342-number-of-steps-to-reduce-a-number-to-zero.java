class Solution {
    public int numberOfSteps(int n) {
        int s=0;
        while(n!=0){
        if(n%2==0){
            s++;
            n/=2;
        }
        else if(n%2==1){
            s++;
            n-=1;
        }
        }
        return s;
    }
}