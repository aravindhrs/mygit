package com.interview.datastructures;

public class BinaryTree {

	public static void main(String[] args) {
		TreeNode d = new TreeNode("d"); 
		TreeNode e = new TreeNode("e"); 
		TreeNode g = new TreeNode("g"); 
		TreeNode k = new TreeNode("k"); 
		TreeNode c = new TreeNode("c", d, null); 
		TreeNode h = new TreeNode("h", k, null); 
		TreeNode b = new TreeNode("b", c, e); 
		TreeNode f = new TreeNode("f", g, h); 
		TreeNode root = new TreeNode("a", b, f);
		
		System.out .println("Printing all leaf nodes of binary tree in Java (recursively)"); 
		System.out.println("root:"+root+"\n");
		printLeaves(root);
	}
	
	public static void printLeaves(TreeNode node) { 
		if (node == null) {
			return; 
		} 
		if (node.isLeaf()) { 
			System.out.printf("Leaf Node:%s\n", node.value); 
		} 
			printLeaves(node.left); 
			printLeaves(node.right);
		}
	
	private static class TreeNode{
		String value;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(String value) {
			this.value=value;
		}

		public TreeNode(String value, TreeNode left, TreeNode right) {
			super();
			this.value = value;
			this.left = left;
			this.right = right;
		}
		
		boolean isLeaf(){
			return left == null?right==null:false;
		}
	}
}
