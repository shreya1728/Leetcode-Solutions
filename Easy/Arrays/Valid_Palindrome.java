class Solution {
    public boolean isPalindrome(String s) {
        String word = s.toLowerCase();
        String answer="";
        String answer1 = "";
        for(int i = 0;i<s.length();i++)
        {
            if((word.charAt(i)>=97 && word.charAt(i)<=(122)) || (s.charAt(i)>=48 &&s.charAt(i)<=57))
            {
                answer = word.charAt(i)+answer;
                answer1 = answer1+word.charAt(i);
            }
        }
        System.out.println(answer);
        if(answer.equals(answer1))
            return true;
        else
            return false;
        
    }
}
