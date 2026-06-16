package WEEK_3.Day_2;

class Solution {
    public int len(ListNode head){
        ListNode temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = len(head);
        if(length==n) return head.next;
        int nodeToRemove= length-n;
        ListNode temp = head;
        int flag = 1;
        while(flag<nodeToRemove){
            temp=temp.next;
            flag++;
        }
        temp.next=temp.next.next;
        return head;

    }
}
