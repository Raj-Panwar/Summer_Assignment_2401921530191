package WEEK_3.Day_2;
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
        this.next = null;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n1 = list1;
        ListNode n2 = list2;
        ListNode head = new ListNode(100);
        ListNode temp = head;
        while(n1!=null && n2!=null){
            if(n1.val<n2.val){
                temp.next=n1;
                temp=temp.next;
                n1=n1.next;
            }
            else{
                temp.next=n2;
                temp=temp.next;
                n2=n2.next;
            }
        }
        while(n1!=null){
            temp.next=n1;
            n1=n1.next;
            temp=temp.next;
        }
        while(n2!=null){
            temp.next=n2;
            n2=n2.next;
            temp=temp.next;
        }
        return head.next;

        
        
    }
}