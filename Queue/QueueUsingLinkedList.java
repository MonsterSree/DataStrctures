class QueueUsingLinkedList{
	class Node{
		int val;
		Node next;
		public Node(int val){
			this.val=val;
			this.next=null;
		}
	}

	Node front;
	Node rear;
	int size;

	public QueueUsingLinkedList(){
		front=null;
		rear=null;
		size=0;

	}

	public void enque(int val){
		Node node=new Node(val);

		if(front==null){
			front=node;
			rear=node;
		}
		else{
			rear.next=node;
			rear=rear.next;
		}
		size++;
	}

	public int dequeue(){
		if(isEmpty()){
			return -1;
		}

		int element=front.val;
		front=front.next;
		size--;
		return element;
	}

	public boolean isEmpty(){
		return size==0;
	}

	public void display(){
		Node temp=front;
		while(temp!=null){
			System.out.print(temp.val+",");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		QueueUsingLinkedList queue=new QueueUsingLinkedList();
		queue.enque(10);
		queue.enque(20);
		queue.enque(30);
		queue.display();
		System.out.println("front element->"+queue.dequeue());
		queue.display();
		System.out.println("front element->"+queue.dequeue());
		queue.display();
		System.out.println("isEmpty->"+queue.isEmpty());
		System.out.println("front element->"+queue.dequeue());
		System.out.println("isEmpty->"+queue.isEmpty());
	}
	
}