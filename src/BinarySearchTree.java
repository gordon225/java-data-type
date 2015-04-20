
public class BinarySearchTree {
	
	public Node root;
	
	public BinarySearchTree(int v){
		this.root = new Node(v);
	}
	
	public BinarySearchTree(){
		super();
	}
	
	public Node insert(Node n, int value){
		
		if(n == null){
			return new Node(value);
		}
		
		if (value < n.getValue()){
			n.setLeft(insert(n.left, value));
		}
		else if (value > n.getValue()){
			n.setRight(insert(n.right, value));
		}
		else{
			throw new IllegalArgumentException("Duplicated value");
		}
		return n;
	}
	
	public boolean search(Node n, int value){
		if (n == null){
			return false;
		}
		if (n.getValue() == value){
			return true;
		}
		if (value < n.getValue()){
			return search(n.left, value);
		}
		else{
			return search(n.right, value);
		}
		
	}
	
	public void print(){
		if (this.root == null){
			System.out.println("");
		}
		Node temp = this.root.left;
		while(temp != null){
			System.out.print(temp.getValue() + " ");
			temp = temp.left;
		}
		System.out.println("\n" + this.root.getValue());
		temp = this.root.right;
		while(temp != null){
			System.out.print(temp.getValue() + " ");
			temp = temp.right;
		}
	}

	private class Node{
		public int data;
		public Node right, left;
		
		public Node(int v){
			this.data = v;
			this.right = null;
			this.left = null;
		}
		
		public Node (Node l, Node r, int v){
			this.left = l;
			this.right = r;
			this.data = v;
		}
		
		public int getValue(){
			return this.data;
		}
		
		public void setLeft(Node n){
			this.left = n;
		}
		
		public void setRight(Node n){
			this.right = n;
		}
	}
}
