class Solution {
    public int passThePillow(int n, int time) {
        int it=(time)/(n-1);
        if(it%2==0)
        {
            return ((time)%(n-1)+1);
        }
    return n-(time)%(n-1);
    }
}
