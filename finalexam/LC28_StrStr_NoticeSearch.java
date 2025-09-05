import java.io.*;
import java.util.*;
public class LC28_StrStr_BulletinSearch {
// 讀入: haystack；下一行 needle；輸出: 第一個出現索引，無則 -1
public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String hay = br.readLine();
String nee = br.readLine();
System.out.println(kmp(hay, nee));
}
// KMP 實作
static int kmp(String s, String p){
if(p.isEmpty()) return 0;
int n=s.length(), m=p.length();
int[] lps = new int[m];
for(int i=1,len=0;i<m;){
if(p.charAt(i)==p.charAt(len)) lps[i++]=++len; else if(len>0) len=lps[len-1]; else lps[i++]=0;
}
for(int i=0,j=0;i<n;){
if(s.charAt(i)==p.charAt(j)){ i++; j++; if(j==m) return i-m; }
else if(j>0) j=lps[j-1]; else i++;
}
return -1;
}
}
