class Solution 
{
    public String[] solution(String[] names) 
    {
        String[] answer = {};
        answer = new String[(names.length+4)/5];
        for(int i = 0; i<answer.length;i++)
        {
            answer[i] = names[i*5];
        }
        return answer;
    }
}