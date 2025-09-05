import java.io.*;
import java.util.*;
public class LC15_ThreeSum_THSRStations {

public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readLine().trim());
int[] a = new int[n];
StringTokenizer st = new StringTokenizer(br.readLine());
for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
Arrays.sort(a);
StringBuilder out = new StringBuilder();
for (int i = 0; i < n; i++) {
if (i > 0 && a[i] == a[i-1]) continue;
int L = i + 1, R = n - 1;
while (L < R) {
int sum = a[i] + a[L] + a[R];
if (sum == 0) {
out.append(a[i]).append(' ').append(a[L]).append(' ').append(a[R]).append('\n');
int vL = a[L], vR = a[R];
while (L < R && a[L] == vL) L++;
while (L < R && a[R] == vR) R--;
} else if (sum < 0) L++; else R--;
}
}
System.out.print(out.toString());
}
}

