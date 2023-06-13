class Solution 
{
    public String solution(String myString) 
    {
        String smyString=myString.toLowerCase();
        String bigAString=smyString.replace("a","A");
        return bigAString;
    }
}