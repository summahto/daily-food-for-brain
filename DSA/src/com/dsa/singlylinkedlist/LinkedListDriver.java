package com.dsa.singlylinkedlist;

import com.dsa.singlylinkedlist.SinglyLinkedList.Node;

public class LinkedListDriver {

	public static void main (String args[]) {
			
			SinglyLinkedList sList = new SinglyLinkedList();
			sList.insertNode(sList, 1);
			sList.insertNode(sList, 2);
			sList.insertNode(sList, 3);
			sList.insertNode(sList, 4);
			sList.insertNode(sList, 3);
			sList.insertNode(sList, 2);
			sList.insertNode(sList, 1);
			
//			sList.insertAtStart(sList,3);
			
			sList.traversal(sList);
			
	//		Node middle = middleNode(sList);
//			Node middle = sList.middleNode2(sList);
//			System.out.println("the middle node is : "+ middle.data);
			
			Boolean palFlag = sList.isPalindrome(sList.head);
			if(palFlag == true) {
				System.out.println(sList.toString() + " is a palindrome");
			}
			else {
				System.out.println(sList.toString() + " is not a palindrome");
			}
				
		}
}
