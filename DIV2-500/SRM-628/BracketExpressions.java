import java.util.*;

public class BracketExpressions {

    public String ifPossible(String expression) {
        char[] expr = expression.toCharArray();
        int N = expr.length;

        if (f(N, expr)) {
            return "possible"; 
        } 
        else {
            return "impossible";
        }
    }
    
    private static boolean f(int N, char[] expr) {
        Stack<Character> stack = new Stack<Character>();
    
        for (int i = 0; i < N; i++) {
            if (expr[i] == '(' || expr[i] == '[' || expr[i] == '{') {
                stack.push(expr[i]);
            }
            else if (expr[i] == 'X') {
                if (stack.empty()) {
                    char[] t1 = expr.clone();
                    t1[i] = '(';
                    char[] t2 = expr.clone();
                    t2[i] = '[';
                    char[] t3 = expr.clone();
                    t3[i] = '{';
                    return f(N, t1) || f(N, t2) || f(N, t3);
                }
                else {
                    char[] t1 = expr.clone();
                    t1[i] = '(';
                    char[] t2 = expr.clone();
                    t2[i] = '[';
                    char[] t3 = expr.clone();
                    t3[i] = '{';
                    
                    char[] t4 = expr.clone();
                    if (stack.peek() == '(') {
                        t4[i] = ')';
                    }
                    else if (stack.peek() == '[') {
                        t4[i] = ']';
                    }
                    else {
                        t4[i] = '}';
                    }
                    
                    return f(N, t1) || f(N, t2) || f(N, t3) || f(N, t4);
                }
                
            }
            else {
                if (stack.empty()) {
                    return false;
                }
                else if ((expr[i] == ')' && stack.peek() == '(') || 
                    (expr[i] == ']' && stack.peek() == '[') ||
                    (expr[i] == '}' && stack.peek() == '{') ||
                    stack.peek() == 'X') {
                    stack.pop();   
                }
                else {
                    return false;
                }
            }
        }
        
        if (stack.empty()) {
            return true;
        }   
        else {
            return false;
        }
    }

}
