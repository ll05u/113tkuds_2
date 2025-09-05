import java.io.*;
import java.util.*;
public class LC32_LongestValidParentheses_MRTIO {

public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
int n = s.length();
Deque<Integer> st = new ArrayDeque<>();
st.push(-1); 
int best = 0;
for (int i = 0; i < n; i++) {
char c = s.charAt(i);
if (c == '(') st.push(i);
else {
st.pop();
if (st.isEmpty()) st.push(i); 
else best = Math.max(best, i - st.peek());
}
}
System.out.println(best);
}
}
