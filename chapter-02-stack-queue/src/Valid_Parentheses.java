import java.util.Stack;

// LC_20
// LC 中使用自己的类 -- 做成 Solution 的内部类
public class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '(' || c == '{')
                st.push(c);
            else {
                if (st.isEmpty())
                    return false;
                char top = st.pop();
                if (top == '(' && c != ')') return false;
                if (top == '[' && c != ']') return false;
                if (top == '{' && c != '}') return false;
            }
        }
        return st.isEmpty();
    }
}
