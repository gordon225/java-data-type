
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
		Node temp = head;
		while(temp.getNext() != null){
			s += temp.getData() + " > ";
			temp = temp.getNext();
		}
		s += temp.getData();
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
		if (index < 0 || index > size-1){
			return false;			
		}
		else{
			Node current = this.head;
			for (int i=0; i < index; i++){
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
			return false;
		}
		Node current = this.head;
		for (int i=0; i<index;i++){
			current = current.getNext();
		}
		return current.getData();
	}
	
	public static void main (String[] args){
		MyLinkedList mll = new MyLinkedList();
		System.out.println(mll.getSize());
		mll.add(1);
		mll.add(1);
		mll.add(2, 1);
		mll.add(1);
		System.out.println(mll.getSize());
		System.out.println(mll);
		System.out.println(mll.get(2));
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
