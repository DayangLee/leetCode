public class RemoveDuplicatesFromSortedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while (list != null && list.next != null){
            if (list.val == list.next.val){
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head= new ListNode(1);
        head.next= new ListNode(1);
        head.next.next= new ListNode(2);
        head.next.next.next = new ListNode(5);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next = null;
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
        ListNode result=removeDuplicatesFromSortedList.deleteDuplicates(head);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}
