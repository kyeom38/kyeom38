class Solution 
{
    public int solution(int[] num_list) 
    {
        int answer = 0;
        int multiply = 1;
        int plus=0;
        for ( int i = 0; i < num_list.length; i++)
        {
            multiply *= num_list [i];
            plus += num_list [i];
        }
        if (multiply < plus*plus)
        {
            answer = 1;
        }
        else if (multiply > plus*plus)
        {
            answer = 0;
        }

        return answer;
    }
}