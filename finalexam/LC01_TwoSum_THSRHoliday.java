import java.io.*;
import java.util.*;
public class LC01_TwoSum_THSRHoliday {

public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());
int n = Integer.parseInt(st.nextToken());
long target = Long.parseLong(st.nextToken());
long[] a = new long[n];
st = new StringTokenizer(br.readLine());
for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());

Map<Long, Integer> need = new HashMap<>();
for (int i = 0; i < n; i++) {
if (need.containsKey(a[i])) {
System.out.println(need.get(a[i]) + " " + i);
return;
}
need.put(target - a[i], i);
}
System.out.println("-1 -1");
}
}
