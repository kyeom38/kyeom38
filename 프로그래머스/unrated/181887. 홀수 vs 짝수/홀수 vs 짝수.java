class Solution 
{
    public int solution(int[] num_list) 
    {
        int answer = 0;
        int even=0;
        int odd=0;
        for(int i = 1;i<num_list.length+1;i++)
        {
            if(i==1||i%2==1)
            {
                odd+=num_list[i-1];
            }
            else
            {
                even+=num_list[i-1];
            }
        }
        if (even>=odd)
        {
            answer = even;
        }
        else if(even<odd)
        {
            answer = odd;
        }
        return answer;
    }
}