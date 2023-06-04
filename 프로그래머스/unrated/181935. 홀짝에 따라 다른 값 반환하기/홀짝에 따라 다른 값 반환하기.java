class Solution 
{
    public int solution(int n) 
    {
        int answer=0;
        for (int i =0; i <=n ; i+=2)
        {
            if (n%2 ==1) 
            {
                answer += i+1;
            }
            else 
            {
                 answer +=i*i;
            }
        }
        return answer;
    }
}