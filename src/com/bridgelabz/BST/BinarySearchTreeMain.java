/**
 * 
 */
package com.bridgelabz.BST;

/**
 * @author PAVITHRA C
 *
 */
public class BinarySearchTreeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree binaryTree = new BinarySearchTree();

		Node node = new Node(56); // head node
		binaryTree.root = node;
		binaryTree.insertElement(node, 30);
		binaryTree.insertElement(node, 70);

		System.out.println("Display Node");
		binaryTree.traverseTree(node);

	}

}
	
