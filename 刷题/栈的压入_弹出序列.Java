
//https://www.nowcoder.com/practice/d77d11405cc7470d82554cb392585106?tpId=13&&tqId=11174&rp=1&ru=/activity/oj&qru=/ta/coding-interviews/question-ranking
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int len = pushA.length;
        for(int i =0 ;i <len ; i++){
            
            stack.push(pushA[i]);
            
            while(!stack.isEmpty() && stack.peek() == popA[index]){
                stack.pop();
                index++;
            }
            
        }
        
        return stack.isEmpty();
        
        
      
    }
}