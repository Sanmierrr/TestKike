package com.pro.leetcode;

import com.pro.entity.ListNode;

import java.util.Stack;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class Hebinlianggeyouxuliebiao {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1 = new ListNode(2,l1);
        l1 = new ListNode(1,l1);
        ListNode l2 = new ListNode(4);
        l2 = new ListNode(3,l2);
        l2 = new ListNode(1,l2);

        ListNode l3 = mergeTwoLists(l1,l2);
        System.out.println("-----------------");
        System.out.print(l3.val);
        System.out.print(l3.next.val);
        System.out.print(l3.next.next.val);
        System.out.print(l3.next.next.next.val);
        System.out.print(l3.next.next.next.next.val);
        System.out.print(l3.next.next.next.next.next.val);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode res = l1.val < l2.val ? l1 : l2;
        res.next = mergeTwoLists(res.next, l1.val >= l2.val ? l1 : l2);
        return res;
    }


}
