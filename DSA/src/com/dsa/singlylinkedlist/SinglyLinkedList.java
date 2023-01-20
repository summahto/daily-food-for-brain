package com.dsa.singlylinkedlist;

public class SinglyLinkedList {

	Node head;
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertNode(SinglyLinkedList list, int data) {
		
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(list.head == null) {
			list.head = newNode;
		}
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void traversal(SinglyLinkedList list) {
		
		Node current = list.head;
		while(current != null) {
			System.out.print(current.data + " \n");
			current = current.next;
		}
	}

	public Node middleNode2(SinglyLinkedList sList) {
		int count = 0;
		Node current = sList.head;
		Node mid = sList.head;
		
		while(current!= null) {
			
			if(count % 2 == 1)
				mid = mid.next;
			
			count++;
			current= current.next;
		}
		return mid;
	}

	public void insertAtStart(SinglyLinkedList sList, int data) {
		Node newNode = new Node(data);
		
		newNode.next = head;
		head = newNode;
	}

	public Node middleNode(SinglyLinkedList sList) {
		Node slow = sList.head;
		Node fast = sList.head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public boolean isPalindrome(Node head) {
        
//      List <Node> revList = new <Node>();
      
      Node fast, slow, mid,current;
      fast = slow = mid = head;
      
      while (fast != null && fast.next != null){
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
        	  Node newNode = current;
              newNode.next = revHead;
              revHead = newNode;
          }
          
          current = current.next;
      }
      boolean isPal = true;
      Node firstHalfEnd = mid;
      while(mid != null || head != firstHalfEnd.next ){
          if (mid != head){
              isPal = false;
              break;
          }
          
      }
      return isPal;
  }
}
