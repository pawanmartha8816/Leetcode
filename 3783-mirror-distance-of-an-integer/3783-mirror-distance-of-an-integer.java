class Solution {
    public int mirrorDistance(int n) {
        int s=0;
        int i=String.valueOf((Math.abs(n))).length();
        int du=n;
        while(n!=0){
            int d=n%10;
            s+=d*Math.pow(10,i-1);
            n/=10;
            System.out.print(s);
            i--;
        }
        System.out.println();
        System.out.print(s);
        System.out.print(du);
        
        return Math.abs(s-du);
    }
}