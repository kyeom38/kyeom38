class Solution 
{
    public int solution(String ineq, String eq, int n, int m) 
    {
        int answer = 0;
        Boolean tof;
        if(ineq.equals("<") && eq.equals("="))
        {
            tof = (n<=m);
            if (tof)
            {
                answer = 1;
            }
        }
        if(ineq.equals("<") && eq.equals ("!"))
        {
            tof = (n<m);
            if (tof)
            {
                answer = 1;
            }
        }
        if(ineq.equals(">") && eq.equals ("="))
        {
            tof = (n>=m);
            if (tof)
            {
                answer = 1;
            }
        }
        if(ineq.equals(">") && eq.equals ("!"))
        {
            tof = (n>m);
            if (tof)
            {
                answer = 1;
            }
        }
        return answer;
    }
}