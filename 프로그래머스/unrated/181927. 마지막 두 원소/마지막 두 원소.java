class Solution 
{
    public int[] solution(int[] num_list) 
    {
        int[] answer =  new int[num_list.length+1];
      
        int m = 0;
        for (int i = 0;i <num_list.length;i++)
        {
            answer[i] = num_list[i];
            if (answer[i] == num_list[i])
            {
                if(num_list[num_list.length-1] > num_list[num_list.length-2])
                {
                    m = (num_list[num_list.length-1]-num_list[num_list.length-2]);
                }
                else if (num_list[num_list.length-1] <= num_list[num_list.length-2])
                {
                    m = ((num_list[num_list.length-1]*2));
                }
            }
        }
        answer[num_list.length] = m;
        return answer;
    }
}