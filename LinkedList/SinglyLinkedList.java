class SinglyLinkedList{

	private Node head;
	private Node tail;
	int size;


	private class Node{
		int val;
		Node next;

		public Node(int val){
			this.val=val;
			this.next=null;
		}
	}

	public SinglyLinkedList(){
		head=null;
		tail=null;
		size=0;
	}

	public void insertFirst(int val){
		Node node=new Node(val);

		if(head==null){
			head=node;
			tail=node;
		}
		else{
			node.next=head;
			head=node;
		}
		size++;
	}

	public void insertLast(int val){
		Node node=new Node(val);

		if(tail==null){
			tail=node;
			head=node;
		}
		else{
			tail.next=node;
			tail=tail.next;
		}
		size++;
	}

	public void insert(int val,int index){

		if(index==0){
			insertFirst(val);
			return;
		}

		if(index==size){
			insertLast(val);
			return;
		}

		Node temp=head;

		for(int i=1;i<index;i++){
			temp=temp.next;
		}

		Node node=new Node(val);
		node.next=temp.next;
		temp.next=node;

		size++;


	}

	public void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println("END");
	}


	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.insertFirst(3);
		sll.insertFirst(2);
		sll.insertFirst(1);
		sll.insertLast(4);
		sll.insertLast(5);
		sll.insertLast(6);
		sll.display();
		sll.insert(9,2);
		sll.display();
	}
}