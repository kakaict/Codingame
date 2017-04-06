package codingame;


/*
 * 
 * a Node has right and left node, is presented by a number. left.value < value < right.value. 
 * 
 */

public class SearchBinaryTreeV2 {

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

		
		
		 Node node =  root.findNode(12);
		 
		 System.out.println(node.value);
		 
		 if (node.left != null) System.out.println(node.left.value);
		 
		 if (node.right != null)  System.out.println(node.right.value);


		
	}
	
	public static class Node {
		
		Node left;
		Node right;
		int value;
		
		public Node(int value){
			this.value = value;
		}
		
		public Node findNode(int val){

			Node node1 = null;
			Node node2 = null;
			if(this.value == val){
				return this;
			} else {
				if(left != null){
					node1 = left.findNode(val);
				}
				if(right != null){
					node2 = right.findNode(val);
				} 
			}
			return node1 != null ? node1 : node2;
		}
		
	}

}
