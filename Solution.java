/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 吉彬
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public static void main(String[] args){
        
    }
    /*
    问题：
    输入一个链表，输出该链表中倒数第k个结点。
    */
    
    /*
    解决思路：
    题中为单向链表不能逆向遍历，只能顺序遍历。
    当链表为空或k的值不合法时返回null即可；
    当链表不为空且k的值合法时，先遍历链表，利用指针p去顺序遍历到第k个节点时，
    用一个指针result记住链表头节点，这样p和result之间的间隔就是k，
    从次以后，p指针没往下遍历一个节点时，result指针也往下遍历一个节点，
    当p指针遍历到最后一个节点时，result刚好指向倒数第k个节点。
    */
    public ListNode FindKthToTail(ListNode head,int k) {
        if(k<=0)//如果要找0号或负数号的节点，返回null
            return null;
        ListNode result = head;
        ListNode p = head;
        for(;p!=null;p=p.next){
            k--;
            if(k<0){
                result = result.next;
            }
        }
        if(k>0)//如果k的值大于链表长度，返回null
            result = null;
        return result;
    }
}
