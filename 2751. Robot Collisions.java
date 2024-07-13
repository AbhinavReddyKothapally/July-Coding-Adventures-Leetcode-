class Solution {
    public List<Integer> survivedRobotsHealths(int[] p, int[] h, String d) {
        TreeMap<Integer,List<Integer>> map=new TreeMap<>();
        for(int i=0;i<p.length;i++)
        {
            List<Integer> list=new ArrayList<>();
            list.add(h[i]);
            list.add(d.charAt(i)=='L'?0:1);
            map.put(p[i],list);    
        }
        Stack<Integer> st=new Stack<>();
        for(int i:map.keySet())
        {
            if(st.size()!=0 && map.get(i).get(1)==0 && map.get(st.peek()).get(1)==1)
            {
                int health1=map.get(i).get(0);
                int health2=map.get(st.peek()).get(0);
                if(health1>health2)
                {
                    while(st.size()>0 && map.get(st.peek()).get(1)==1)
                    {
                        if(health1>health2)
                        {
                            map.get(st.peek()).set(0,0);
                            st.pop();
                            health1--;
                            map.get(i).set(0,health1);
                            if(st.size()>0)
                            health2=map.get(st.peek()).get(0);
                        }
                        else if(health2>health1)
                        {
                     health2--;
                        map.get(st.peek()).set(0,health2);
                     map.get(i).set(0,0);
                     break;
                        }
                        else
                            {
                       map.get(st.peek()).set(0,0);
                      map.get(i).set(0,0);
                      st.pop();
                      break;
                        }
                    }
                    if(st.size()==0)
                    st.push(i);
                }
                else if(health2>health1)
                {
                    health2--;
                    map.get(st.peek()).set(0,health2);
                    map.get(i).set(0,0);
                }
                else
                {
                    map.get(st.peek()).set(0,0);
                    map.get(i).set(0,0);
                    st.pop();
                }
            }
            else
            {
                st.push(i);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<p.length;i++)
        {
            if(map.get(p[i]).get(0)>0)
            ans.add(map.get(p[i]).get(0));
        }
        return ans;
    }
}
