import java.util.Arrays;
import java.util.Set;




public class MyLinkedList {
	
	private Node head;
	private int size;
	
	public MyLinkedList(){
		this.size = 0;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public String toString(){
		String s = "";
		if (this.head != null){
			Node temp = head;
			while(temp.getNext() != null){
				s += temp.getData() + " > ";
				temp = temp.getNext();
			}
			s += temp.getData();
		}
		return s;
	}
	
	public void add(Object value){
		if (this.size == 0){
			Node tempHead = new Node(value);
			this.head = tempHead;
			this.size++;
		}
		else{
			Node current = this.head;
			while (current.getNext() != null){
				current = current.getNext();
			}
			current.setNext(new Node(value));
			this.size++;
		}
	}
	
	public boolean add(Object value, int index){
		
		if(this.size == 0){
			this.add(value);
			return true;	
		}		
		else if (index < 0 || index > size-1){
			return false;			
		}
		else if (index == 0){
			Node tempHead = new Node(value);
			tempHead.setNext(this.head);
			this.head = tempHead;
			this.size++;
			return true;
		}
		else{
			Node current = this.head;
			int i = 0;
			while (i < index){
				current = current.getNext();
			}
			Node nNode = new Node(value);
			nNode.setNext(current.getNext());
			current.setNext(nNode);
			this.size++;
			return true;
		}		
	}
	
	public Object get(int index){
		if (index < 0 || index > this.size-1) {
			return null;
		}
		Node current = this.head;
		for (int i=0; i<index;i++){
			current = current.getNext();
		}
		return current.getData();
	}
	
	public boolean remove(int index){
		if (index < 0 || index > this.size-1) {
			return false;
		}
		else if(index == 0){
			Node current = this.head;
			Node temp = current.getNext();
			this.head = temp;
			this.size--;
			return true;
		}
		Node current = this.head;
		for (int i=1; i<index;i++){
			current = current.getNext();
		}
		Node temp = current.getNext().getNext();
		current.setNext(temp);
		this.size--;
		return true;
	}
	
	public boolean set(Object value, int index){
		if (index < 0 || index > this.size-1) {
			return false;
		}
		Node current = this.head;
		for (int i=0; i<index;i++){
			current = current.getNext();
		}
		current.setData(value);
		return true;
	}
	
	public Object mid(){		
		if(this.size == 0){
			return null;
		}
		else{
			Node oneStep = this.head;
			Node twoStep = this.head;
			int i = 0;
			while(oneStep.getNext() != null){
				oneStep = oneStep.getNext();
				i++;
				if(i % 2 == 0){
					twoStep = twoStep.getNext();
				}
			}
			return twoStep.getData();
		}
	}
	
	public void reverseIterative(){
		if (this.size < 2){
			return;
		}
		Node current = this.head;
		while (current.next != null){
			Node next = current.getNext();
			Node temp = next.getNext();
			current.setNext(temp);
			next.setNext(this.head);
			this.head = next;			
		}
		System.out.println(this);
	}
	
	public void reverseRecursive(Node n){
		if (n == null){
			return;
		}		
		if (n.getNext() == null){
			this.head = n;
			return;
		}
		reverseRecursive(n.getNext());
		n.getNext().setNext(n);
		n.setNext(null);
	}
	
	public static void main (String[] args){
		BinarySearchTree bst = new BinarySearchTree();
		bst.root = bst.insert(bst.root, 2);
		bst.root = bst.insert(bst.root, 1);		
		bst.root = bst.insert(bst.root, 3);
		bst.root = bst.insert(bst.root, 4);
		bst.root = bst.insert(bst.root, 5);
		bst.print();
		System.out.println(bst.search(bst.root, 3));
	}
	
	private class Node{
		public Node next = null;
		public Object data;
		
		public Node(Object value){
			this.data = value;
			this.next = null;
		}
		
		public Object getData(){
			return data;
		}
		
		public void setData(Object value){
			this.data = value;
		}
		
		public void setNext(Node next){
			this.next = next;
		}
		
		public Node getNext(){
			return this.next;
		}
		
	}
	

}
