package com.dev.codeshere;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
public static void main(String[] args) {
	Node nodeA = new Node("a");
	Node nodeB = new Node("b");
	Node nodeC = new Node("c");
	Node nodeD = new Node("d");
	Node nodeE = new Node("e");
	Node nodeF = new Node("f");
	Node nodeG = new Node("g");
	Node nodeH = new Node("h");
	Node nodeI = new Node("i");
	Node nodeJ = new Node("j");
	Node nodeK = new Node("k");
	Node nodeL = new Node("l");
	
	nodeA.addLeftNode(nodeB);
	nodeA.addRightNode(nodeC);
	nodeB.addLeftNode(nodeD);
	nodeB.addRightNode(nodeE);
	nodeD.addLeftNode(nodeF);
	nodeC.addLeftNode(nodeG);
	nodeC.addRightNode(nodeH);
	nodeH.addLeftNode(nodeI);
	nodeI.addLeftNode(nodeJ);
	nodeH.addRightNode(nodeK);
	nodeK.addLeftNode(nodeL);
	BinaryTree bt = new BinaryTree();
	System.out.println(bt.getCommonParent(nodeB, nodeC).data);
	System.out.println(bt.getCommonParent(nodeD, nodeC).data);
	System.out.println(bt.getCommonParent(nodeD, nodeE).data);
	System.out.println(bt.getCommonParent(nodeF, nodeE).data);
	System.out.println(bt.getCommonParent(nodeF, nodeC).data);
	System.out.println(bt.getCommonParent(nodeG, nodeC).data);
	System.out.println(bt.getCommonParent(nodeJ, nodeC).data);
}

	public Node getCommonParent(Node node1, Node node2) {
		List<Node> node1Parents = new ArrayList<Node>();
		List<Node> node2Parents = new ArrayList<Node>();
		while(node1.parent != null) {
			node1Parents.add(node1);
			node1 = node1.parent;
		}
		node1Parents.add(node1);
		
		while(node2.parent != null) {
			node2Parents.add(node2);
			node2 = node2.parent;
		}
		node2Parents.add(node2);
		
		for(Node node1parent: node1Parents) {
			for(Node node2parent: node2Parents) {
				if(node1parent.equals(node2parent)) return node1parent;
			}
		}
		return null;
	}
}

class Node {
	String data;
	Node leftChild;
	Node rightChild;
	Node parent;
	
	public Node(String data) {
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
		this.parent = null;
	}
	
	public void addRightNode(Node newNode) {
		this.rightChild = newNode;
		newNode.parent = this;
	}
	
	public void addLeftNode(Node newNode) {
		this.leftChild = newNode;
		newNode.parent = this;
	}
}
