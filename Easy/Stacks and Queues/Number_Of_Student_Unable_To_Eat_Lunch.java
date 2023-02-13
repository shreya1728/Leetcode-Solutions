class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int student,count = 0,not_match = 0;
        for(int x: students)
            queue.offer(x);
        for(int y = sandwiches.length-1;y>=0;y--)
            stack.push(sandwiches[y]);
        while(not_match!=queue.size())        
        {
            if(stack.peek()==queue.peek())
            {
                count++;                
                not_match = 0;
                queue.poll();
                stack.pop();
            }
            else
            {
                not_match++;
                student = queue.poll();
                queue.offer(student);
            }
        }
        return students.length - count;
    }
}