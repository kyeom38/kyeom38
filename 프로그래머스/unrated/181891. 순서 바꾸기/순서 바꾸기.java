import java.util.Arrays;
class Solution 
{
    public int[] solution(int[] num_list, int n) 
    {
        int[] answer = {};
        int count=0;
        answer = new int[num_list.length];
        int [] num_list_a = Arrays.copyOfRange(num_list,0,n);
        int [] num_list_b = Arrays.copyOfRange(num_list,n,num_list.length);
        for(int i =0; i< num_list.length;i++)
        {
            if(i<num_list.length-n)
            {
                answer[i] = num_list_b[i];  
            }
            else
            {
                answer[i] = num_list_a[count];
                count++;
            }
        }
        
        return answer;
    }
}