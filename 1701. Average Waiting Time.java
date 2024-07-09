class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n=customers.length;
        int idle=customers[0][0];
        double wt=0;
        int i=0;
        while(i<n)
        {
            if(customers[i][0]>idle)
            {
                idle=customers[i][0]+customers[i][1];
                wt+=(customers[i][1]);
            }
            else
            {
                wt+=((idle-customers[i][0])+customers[i][1]);
                idle=idle+customers[i][1];
            }
            i++;
        }
        return wt/n;
    }
}
