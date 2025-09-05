import java.io.*;
import java.util.*;
public class LC19_RemoveNthFromEnd_Nursing {
static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }
public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 讀入: n，下一行 n 整數，下一行 N（要刪第 N 個倒數）
int n = Integer.parseInt(br.readLine().trim());
StringTokenizer st = new StringTokenizer(br.readLine());
ListNode dummy = new ListNode(0), cur = dummy;
for (int i = 0; i < n; i++) { cur.next = new ListNode(Integer.parseInt(st.nextToken())); cur = cur.next; }
int N = Integer.parseInt(br.readLine().trim());
ListNode head = remove(dummy.next, N);
print(head);
}
// 兩指標間距 N
static ListNode remove(ListNode head, int n){
ListNode dummy = new ListNode(0); dummy.next = head;
ListNode fast = dummy, slow = dummy;
for (int i=0;i<n;i++) fast = fast.next;
while (fast.next != null) { fast = fast.next; slow = slow.next; }
slow.next = slow.next.next;
return dummy.next;
}
static void print(ListNode h){
StringBuilder sb = new StringBuilder();
while(h!=null){ sb.append(h.val).append(' '); h=h.next; }
if (sb.length()>0) sb.setLength(sb.length()-1);
System.out.println(sb.toString());
}
}
