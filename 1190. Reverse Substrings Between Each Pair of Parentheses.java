class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=')')
                st.push(s.charAt(i));
            else
            {
        StringBuilder sb=new StringBuilder();
                while(st.peek()!='(')
                {
                    sb.insert(0,st.pop());
                }
                st.pop();
                sb=sb.reverse();
                if(st.size()==0 && i==n-1)
                return sb.toString();
                else
                {
                    for(int j=0;j<sb.length();j++)
                        st.push(sb.charAt(j));
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()!=0)
            sb.insert(0,st.pop());
        return sb.toString();
    }
}
