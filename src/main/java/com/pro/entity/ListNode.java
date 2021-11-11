package com.pro.entity;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val){
            this.val = val;
        }
        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
}
