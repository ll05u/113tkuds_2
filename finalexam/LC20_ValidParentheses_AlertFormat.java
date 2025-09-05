import java.io.*;
import java.util.*;
public class LC20_ValidBrackets_Emergency {

public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
Deque<Character> st = new ArrayDeque<>();
for (char c : s.toCharArray()) {
if (c == '(' || c == '[' || c == '{') st.push(c);
else {
if (st.isEmpty()) { System.out.println(false); return; }
char p = st.pop();
if (!match(p, c)) { System.out.println(false); return; }
}
}
System.out.println(st.isEmpty());
}
static boolean match(char a, char b) {
return (a=='('&&b==')')||(a=='['&&b==']')||(a=='{'&&b=='}');
}
}

