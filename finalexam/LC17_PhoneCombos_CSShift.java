import java.io.*;
import java.util.*;
public class LC17_PhoneNumberCombinations {
  
static final String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
static List<String> ans = new ArrayList<>();
public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String digits = br.readLine().trim();
if (digits.isEmpty()) { return; }
dfs(digits, 0, new StringBuilder());
StringBuilder out = new StringBuilder();
for (String s : ans) out.append(s).append('\n');
System.out.print(out.toString());
}
static void dfs(String d, int i, StringBuilder cur) {
if (i == d.length()) { ans.add(cur.toString()); return; }
for (char c : map[d.charAt(i) - '0'].toCharArray()) {
cur.append(c);
dfs(d, i + 1, cur);
cur.deleteCharAt(cur.length() - 1);
}
}
}
