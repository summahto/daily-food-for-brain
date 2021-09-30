package com.dsa.tree;

public class BinaryTree {
	
	Node root;
	
	
	int maxDepth(Node root) {
		
		if (root == null) {
			return -1;
		}
		else {
			
			int lDepth = maxDepth(root.left);
			int rDepth = maxDepth(root.right);
			
			if (lDepth > rDepth)
				return lDepth + 1;
			
			return rDepth + 1;
						
		}
	}
	
	public static void main(String args[]) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Height of the Tree is " + tree.maxDepth(tree.root));
	}
}
