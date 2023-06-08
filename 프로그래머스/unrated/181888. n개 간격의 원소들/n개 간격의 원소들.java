import java.util.ArrayList;
class Solution 
{
    public int[] solution(int[] num_list, int n) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        for (int p : num_list)
        {
            if(i%n==0)
            {
                list.add(p);
            }
            i++;
        }
        int[] answer = new int[list.size()];
        for(int p = 0; p<list.size(); p++)
        {
            answer[p] = list.get(p);
        }
        return answer;
    }
}