package com.lxiao.leetcode.algorithm;

/**
 * leetCode 题目 2. add tow numbers
 * 给你两个链表，来表示两个非负数，这两个数字是逆序排列在链表中的，而且链表的每一个节点都是一个single digit ，将这两个数相加，并且按照以相同的链表表示法返回
 * 例子：
 * (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * result: (7 -> 0 -> 8)
 * 因为 342 + 465 = 807
 *
 * 此问题，刚开始的时候，我是先计算出两个链表代表的数字，然后相加得到结果，再拆分为链表格式，但是这种方法对链表长度有限制，也就是对数字大小有限制，
 * 一旦两个链表代表的数字超过了int类型的最大值，那么就算不出来了。
 *
 * 所以其实这道题的解法，就是按照平时算加法的步骤去解答就可以了
 *
 *
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        this.val = x;
    }
}

public class AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int plus = 0;
        ListNode head = null, tail = null;
        while (l1!=null || l2 != null || plus != 0) {
            int x =0, y = 0;
            if (l1 != null) {
                x = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                y = l2.val;
                l2 = l2.next;
            }

            int val = x + y + plus;
            if (val >= 10) {
                val = val - 10;
                plus = 1;
            } else {
                plus = 0;
            }
            ListNode node = new ListNode(val);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }



    private int getNum(ListNode listNode) {
        int times = 1;
        int sum = 0;
        while(listNode != null) {
            sum += listNode.val * times;
            times = times * 10;
            listNode = listNode.next;
        }
        return sum;
    }

    // 将数字拆分为单个数
    private ListNode splitNumberToList(int num) {
        ListNode head = null, tail = null;
        long times = 10L;
        while(true) {
            // 先取余数，然后在做除法，获取当前位的数值
            Long yu =  (num % times);
            int correctNum = (int) ((yu * 10) / times);
            ListNode node = new ListNode(correctNum);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }

            if (times > num) {
                break;
            }
            times = times * 10;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(6);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);
        listNode.next.next.next.next = new ListNode(3);
        listNode.next.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next.next = new ListNode(9);
        listNode.next.next.next.next.next.next.next = new ListNode(3);
        listNode.next.next.next.next.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next.next.next.next.next = new ListNode(1);

        ListNode node = new ListNode(0);
        node.next = new ListNode(6);
        node.next.next = new ListNode(9);
        node.next.next.next = new ListNode(9);
        node.next.next.next.next = new ListNode(1);
        node.next.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next.next.next = new ListNode(0);
        node.next.next.next.next.next.next.next.next = new ListNode(5);

        AddTwoNum addTwoNum = new AddTwoNum();
        ListNode head = addTwoNum.addTwoNumbers(listNode, node);
        while(head != null) {
            System.out.print(head.val);
            head = head.next;
        }
    }

}
