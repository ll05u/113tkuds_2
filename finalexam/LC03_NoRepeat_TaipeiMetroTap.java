import java.io.*;
import java.util.*;
public class LC03_LongestSubstr_TaipeiMRT {

public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();

int[] last = new int[256];
Arrays.fill(last, -1);
int best = 0, left = 0;
for (int i = 0; i < s.length(); i++) {
char c = s.charAt(i);
if (last[c] >= left) left = last[c] + 1;
last[c] = i;
best = Math.max(best, i - left + 1);
}
System.out.println(best);
}
}
