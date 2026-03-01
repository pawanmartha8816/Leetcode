class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int s=0;
        int du=n;
        while(n!=0){
            int d=n%10;
            s+=d;
            n/=10;
        }
        if(du%s==0) return s;
        else return -1;
    }
}