class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(int i=0;i<logs.length;i++)
        {
            if(logs[i].equals("../") && count>0)
                count--;
            else if(!(logs[i].charAt(0)=='.'))
                count++;
        }
        return count<=0?0:count;
    }
}
