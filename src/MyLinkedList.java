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
	
	
	
	public static void main (String[] args){
		System.out.println(ArraynString.reverseInt(1020));
		System.out.println(ArraynString.reverseInt(21112));
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
