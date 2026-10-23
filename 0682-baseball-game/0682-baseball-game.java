class Solution {
    public int calPoints(String[] operations) 
    {
        Stack<Integer> s=new Stack<>();

        for (int i=0; i<operations.length; i++) 
        {
            if (operations[i].equals("C")) 
            {
                s.pop();
            } 
            else if (operations[i].equals("D")) 
            {
                s.push(s.peek()*2);
            } 
            else if (operations[i].equals("+")) 
            {
                int x=s.pop();
                int y=s.peek();
                s.push(x);
                s.push(x+y);
            } 
            else 
            {
                s.push(Integer.parseInt(operations[i]));
            }
        }

        int sum=0;
        for (int i=0; i<s.size(); i++) 
        {
            sum+=s.get(i);
        }

        return sum;
    }
}