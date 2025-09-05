import java.io.*;
import java.util.*;
public class LC11_MaxSubarray_FuelPromo {
// 讀入: n，下一行 n 個整數；輸出: 最大子陣列和
public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readLine().trim());
StringTokenizer st = new StringTokenizer(br.readLine());
long best = Long.MIN_VALUE, cur = 0;
for (int i = 0; i < n; i++) {
long x = Long.parseLong(st.nextToken());
cur = Math.max(x, cur + x); // Kadane
best = Math.max(best, cur);
}
System.out.println(best);
}
}
