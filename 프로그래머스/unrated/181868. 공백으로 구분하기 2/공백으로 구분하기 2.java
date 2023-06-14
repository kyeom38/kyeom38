class Solution 
{
    public String[] solution(String my_string) 
    {
        String ny_string=my_string.trim();
        String[] answer =ny_string.split("\\ +");
        return answer;
    }
}