package com.dsa.singlylinkedlist;

import java.util.List;

import com.dsa.singlylinkedlist.SinglyLinkedList.Node;

public class CheckPalindromeList {
	
	
public boolean isPalindrome(Node head) {
        
//        List <Node> revList = new <Node>();
        
        Node fast, slow, mid,current;
        fast = slow = mid = head;
        
        while (fast != null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            // midInd++;
        }
        
        mid = slow;
        current = slow;
        Node revHead = null;
        while(current != null){
            if(revHead == null){
                revHead = mid;
            }
            else{
                current.next = revHead;
                revHead = current;
            }
            
            current = current.next;
        }
        boolean isPal = true;
        Node firstHalfEnd = mid;
        while(mid != null || head != firstHalfEnd ){
            if (mid != head){
                isPal = false;
                break;
            }
            
        }
        return isPal;
    }
}
