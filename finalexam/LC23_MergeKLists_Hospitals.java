import java.io.*;
import java.util.*;
public class LC23_MergeKSortedLists_Realtime {
static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }
public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int k = Integer.parseInt(br.readLine().trim());
List<ListNode> lists = new ArrayList<>();
for (int t=0; t<k; t++) {
int n = Integer.parseInt(br.readLine().trim());
StringTokenizer st = new StringTokenizer(br.readLine());
lists.add(build(n, st));
}
print(mergeK(lists.toArray(new ListNode[0])));
}
static ListNode build(int n, StringTokenizer st){
ListNode d = new ListNode(0), c = d;
for(int i=0;i<n;i++){ c.next=new ListNode(Integer.parseInt(st.nextToken())); c=c.next; }
return d.next;
}
static ListNode mergeK(ListNode[] lists){
PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(o->o.val));
for (ListNode h: lists) if (h!=null) pq.offer(h);
ListNode d=new ListNode(0), c=d;
while(!pq.isEmpty()){
ListNode x = pq.poll();
c.next = x; c=c.next;
if (x.next!=null) pq.offer(x.next);
}
return d.next;
}
static void print(ListNode h){
StringBuilder sb=new StringBuilder();
while(h!=null){ sb.append(h.val).append(' '); h=h.next; }
if(sb.length()>0) sb.setLength(sb.length()-1);
System.out.println(sb.toString());
}
}
