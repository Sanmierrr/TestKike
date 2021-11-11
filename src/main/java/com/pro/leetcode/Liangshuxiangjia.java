package com.pro.leetcode;

import com.pro.entity.ListNode;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 * 二、两数相加
 */
public class Liangshuxiangjia {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1 = new ListNode(4,l1);
        l1 = new ListNode(2,l1);
        ListNode l2 = new ListNode(4);
        l2 = new ListNode(6,l2);
        l2 = new ListNode(5,l2);
        System.out.print(l1.val);
        System.out.print(l1.next.val);
        System.out.println(l1.next.next.val);
        System.out.println("-----------------");
        System.out.print(l2.val);
        System.out.print(l2.next.val);
        System.out.println(l2.next.next.val);

        ListNode l3 = addTwoNumbers(l1,l2);
        System.out.println("-----------------");
        System.out.print(l3.val);
        System.out.print(l3.next.val);
        System.out.println(l3.next.next.val);
    }
//    public ListNode addTwoNumbers(){
//        ListNode pre = new ListNode(0);
//        ListNode cur = pre;
//        int carry = 0;
//        while (l1 != null || l2 != null){
//            int x = l1 == null ? 0 : l1.val;
//            int y = l2 == null ? 0 : l2.val;
//            int sum = x + y + carry;
//
//            carry = sum / 10;
//            sum = sum % 10;
//            cur.next = new ListNode(sum);
//
//            cur = cur.next;
//            if (l1 != null){
//                l1 = l1.next;
//            }
//            if (l2 != null){
//                l2 = l2.next;
//            }
//        }
//        if (carry == 1){
//            cur.next = new ListNode(carry);
//        }
//        System.out.println(pre.next);
//        ListNode next = pre.next;
//        return next;
//    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers2(l1,l2,0);
    }
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2,int a) {
        if(l1 == null && l2 == null){
            return a == 0 ? null : new ListNode(a);
        }
        if(l1 != null){
            a += l1.val;
            l1 = l1.next;
        }
        if(l2 != null){
            a += l2.val;
            l2 = l2.next;
        }
        return new ListNode(a%10,addTwoNumbers2(l1,l2,a/10));
    }
}
