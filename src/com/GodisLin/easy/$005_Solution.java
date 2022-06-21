package com.GodisLin.easy;

import java.util.Stack;

public class $005_Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '(') st.push(')');
            else if(s.charAt(i) == '[') st.push(']');
            else if(s.charAt(i) == '{') st.push('}');
            else if(st.empty() || s.charAt(i) != st.peek()) return false;
            else st.pop();
        }
        return st.empty();
    }
}
