package com.dsa.tree;

public class BinaryTree {

	Node root;


	int maxDepth(Node root) {

		if (root == null) {
			return -1;
		} else {

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
		tree.root.left.right.right = new Node(9);
		tree.root.left.right.right.right = new Node(8);


		System.out.println("Height of the Tree is " + tree.maxDepth(tree.root));
		System.out.println("Height of the Tree is " + tree.maxDepthRecursive(tree.root));

		Node curr = tree.root;

		inOrderTraversal(tree.root);

		}

	private int maxDepthRecursive(Node root) {

		if(root.left == null && root.right == null)
			return 0;
		else if(root.left != null && root.right == null)
			return 1 + maxDepthRecursive(root.left);
		else if(root.left == null && root.right != null)
			return 1 + maxDepthRecursive(root.right);
		else
			return 1 + Math.max(maxDepthRecursive(root.left), maxDepthRecursive(root.right));

	}

	private static void inOrderTraversal(Node curr) {

//		Node curr = root;
		if(curr == null)
			return;

		inOrderTraversal(curr.left);

		System.out.println(curr.data);

		inOrderTraversal(curr.right);
	}
}
