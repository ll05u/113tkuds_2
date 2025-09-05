import java.io.*;
import java.util.*;
public class LC33_SearchInRotatedArray {

public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readLine().trim());
int[] a = new int[n];
StringTokenizer st = new StringTokenizer(br.readLine());
for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
int target = Integer.parseInt(br.readLine().trim());
System.out.println(search(a, target));
}
static int search(int[] a, int t){
int l=0,r=a.length-1;
while(l<=r){
int mid=(l+r)>>>1;
if(a[mid]==t) return mid;
if(a[l] <= a[mid]){ // 左半段有序
if(a[l] <= t && t < a[mid]) r=mid-1; else l=mid+1;
}else{ // 右半段有序
if(a[mid] < t && t <= a[r]) l=mid+1; else r=mid-1;
}
}
return -1;
}
}
