class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> answer = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        char arr[] = p.toCharArray();
        for(char c:arr)
            set.add(c);
        Arrays.sort(arr);
        for(int i = 0;i<=s.length()-p.length();i++)
        {
            if(set.contains(s.charAt(i)))
            {               
                char temp[] = s.substring(i,i+p.length()).toCharArray();
                Arrays.sort(temp);
                if(Arrays.equals(temp,arr))
                    answer.add(i);
            }
        }
        return answer;       
    }
}
