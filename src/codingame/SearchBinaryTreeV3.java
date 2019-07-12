package codingame;

/**
*
*khaitq on 25 févr. 2018
*/

public class SearchBinaryTreeV3 {

	public static void main(String[] args) {

		
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(15);
		root.left.left = new Node(6);
		root.left.right = new Node(12);
		root.right.left = new Node(14);
		root.right.right = new Node(35);
		root.left.right.right = new Node(45);
		root.left.right.right.right = new Node(55);
		root.left.right.left = new Node(6);
		
		root.right.left.left = new Node(13);
		root.right.left.right = new Node(18);
		
	}
	
	private static int findTreeLength(Node root) {
		
		
		return 0;
	}
	
	public static class Node {
		
		public Node(int i) {
			v = i;
		}

		Node left;
		
		Node right;
		
		int v;
	}

}


