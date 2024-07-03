class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> map1=new HashMap<>();
      HashMap<Integer,Integer> map2=new HashMap<>();
      for(int i=0;i<nums1.length;i++)
      map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);  
    for(int i=0;i<nums2.length;i++)
    {
        if(map1.containsKey(nums2[i]))
        map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
    }
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i:map2.keySet())
    {
        int size=Math.min(map1.get(i),map2.get(i));
        for(int j=0;j<size;j++)
        arr.add(i);
    }
    int[] ans=new int[arr.size()];
    for(int i=0;i<arr.size();i++)
    ans[i]=arr.get(i);
    return ans;
}
}
