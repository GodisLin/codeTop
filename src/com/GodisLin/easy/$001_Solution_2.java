package com.GodisLin.easy;

import com.GodisLin.basic.ListNode;

public class $001_Solution_2 {
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
