package com.GodisLin.easy;

import com.GodisLin.basic.ListNode;

public class $003_Solution_1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dump = new ListNode(0);
        ListNode cur = dump;
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1 == null){
            cur.next = list2;
        }else{
            cur.next = list1;
        }
        return dump.next;
    }
}
