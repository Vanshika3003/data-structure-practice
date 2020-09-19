import java.util.Stack;
class test
{
    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
}

static String infixtopostfix(String exp)
{
    String res=new String();
    Stack<Character> stack=new Stack<>();
    for(int i=0;i<exp.length();i++)
    {
        char c=exp.charAt(i);
        if(Character.isLetterOrDigit(c))
        {
            res=res+c;
        }
        else if(c=='(')
        {
            stack.push(c);
        }
        else if(c==')')
        {
            while(!stack.isEmpty()&&stack.peek()!='(')
            {
                res=res+stack.peek();
                stack.pop();
            }
            stack.pop();
        }
        else{
            while(!stack.isEmpty()&&Prec(c) <= Prec(stack.peek()))
            {
                res += stack.pop(); 
            }
            stack.push(c);
        }
    }
    while (!stack.isEmpty()){ 
             
            res += stack.pop(); 
         } 
        return res; 
    } 
    


 public static void main(String[] args)  
    { 
        String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
        System.out.println(infixtopostfix(exp)); 
    } 
} 
    




