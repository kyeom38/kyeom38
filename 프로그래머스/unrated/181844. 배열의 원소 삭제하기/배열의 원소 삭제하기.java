import java.util.ArrayList;
class Solution 
{
    public int[] solution(int[] arr, int[] delete_list) 
    {
        int[] answer = {};
        ArrayList<Integer> answer_list = new ArrayList<Integer>();
        for(int i =0; i<arr.length; i++)
        {
            boolean tof=false;
            for(int j=0; j<delete_list.length; j++)
            {
                if (arr[i] == delete_list[j])
                {
                    tof = true;
                    break;
                }
            }
            if (tof==false)
            {
                answer_list.add(arr[i]); 
            }
        }
        answer = new int[answer_list.size()];
        for(int i =0; i<answer_list.size();i++)
        {
            answer[i] = answer_list.get(i);
        }
        return answer;
    }
}