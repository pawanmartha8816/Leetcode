class Solution {
    public int maximumWealth(int[][] a) {
        int m=a.length;
        //int n=a[i].length;
        int s=0,su=0;
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            s=0;
            for(int j=0;j<a[i].length;j++){
                s+=a[i][j];
            }
            b[su++]=s;
        }
        Arrays.sort(b);
        return b[m-1];
    }
}