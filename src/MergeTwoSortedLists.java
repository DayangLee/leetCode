/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergeList;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return  l1;

        if(l1.val <= l2.val){
            mergeList = l1;
            mergeList.next = mergeTwoLists(l1.next,l2);
        } else {
            mergeList = l2;
            mergeList.next = mergeTwoLists(l1,l2.next);
        }

        return mergeList;

    }

    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        System.out.println();
    }
}
