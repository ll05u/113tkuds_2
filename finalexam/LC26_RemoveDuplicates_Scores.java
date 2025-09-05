import java.io.*;
import java.util.*;
public class LC26_RemoveDuplicates_ScoreSheet {
static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }
public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readLine().trim());
StringTokenizer st = new StringTokenizer(br.readLine());
ListNode d = new ListNode(0), c=d;
for(int i=0;i<n;i++){ c.next=new ListNode(Integer.parseInt(st.nextToken())); c=c.next; }
print(deleteDuplicates(d.next));
}
static ListNode deleteDuplicates(ListNode head){
ListNode cur=head;
while(cur!=null && cur.next!=null){
if(cur.val==cur.next.val) cur.next=cur.next.next; else cur=cur.next;
}
return head;
}
static void print(ListNode h){
StringBuilder sb=new StringBuilder();
while(h!=null){ sb.append(h.val).append(' '); h=h.next; }
if(sb.length()>0) sb.setLength(sb.length()-1);
System.out.println(sb.toString());
}
}
