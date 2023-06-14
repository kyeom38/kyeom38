class Solution 
{
    public int solution(int[] arr1, int[] arr2) 
    {
        int answer = 0;
        int haparr1 = 0;
        int haparr2 = 0;
        if(arr1.length==arr2.length)
        {
            for(int i = 0; i<arr1.length;i++)
            {
                haparr1 += arr1[i];
                haparr2 += arr2[i]; 
            }
        }
        if(arr1.length>arr2.length || haparr1>haparr2)
        {
            answer = 1;
        }
        else if(arr1.length<arr2.length || haparr1<haparr2)
        {
            answer = -1;
        }
        return answer;
    }
}