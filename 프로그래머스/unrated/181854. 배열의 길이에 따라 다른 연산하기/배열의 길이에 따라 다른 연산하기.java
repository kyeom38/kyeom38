class Solution 
{
    public int[] solution(int[] arr, int n) 
    {
        int[] answer = {};
        answer = new int[arr.length];
        if (arr.length%2==1)
        {
            for(int i =0; i<arr.length;i++)
            {
                if(i%2==1)
                {
                    answer[i] = arr[i];
                }
                else
                {
                answer[i] = arr[i]+n;
                }
            }
        }
        else
        {
            for(int i =0; i<arr.length;i++)
            {
                if(i%2==0)
                {
                    answer[i] = arr[i];
                }
                else
                {
                answer[i] = arr[i]+n;           
                }
            }
        }
        return answer;
    }
}