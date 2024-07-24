class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n=nums.length;
        TreeMap<Integer,List<Integer>> map=new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            int num=nums[i];
            int newnum=0;
            int prod=1;
            if(num==0)
            newnum=mapping[0];
            else{
            while(num!=0)
            {
                int rem=num%10;
                newnum=newnum+(mapping[rem]*prod);
                prod*=10;
                num/=10;
            }
            }
            if(!map.containsKey(newnum))
                map.put(newnum,new ArrayList<Integer>());
            map.get(newnum).add(nums[i]);
        }
        int k=0;
        for(int i:map.keySet())
        {
            for(int j=0;j<map.get(i).size();j++)
                nums[k++]=map.get(i).get(j);
        }

        return nums;
    }
}
