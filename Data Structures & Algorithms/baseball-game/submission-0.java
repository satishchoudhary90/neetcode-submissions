class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();

        for(String op:ops){
            if(op.equals("+")){
                int top=stack.pop();
                int sum=top+stack.peek();
                stack.push(top);
                stack.push(sum);
            }
            else if(op.equals("D")){
                stack.push(stack.peek()*2);
            }
             else if(op.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(op));
            }
             }
            int total=0;
            while(!stack.isEmpty()){
                total+=stack.pop();
            }
        return total;
    }
}