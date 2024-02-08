class MyQueue{
	int[] arr;
	int front;
	int rear;
	int size;
	
	public MyQueue(int capacity){
		this.arr=new int[capacity];
		this.front=0;
		this.rear=0;
		this.size=0;

	}

	public void enque(int x){
		if(isFull()){
			return;
		}
		arr[rear++]=x;
		size++;
	}

	public int dequeue(){
		if(isEmpty()){
			return -1;
		}
		int element=arr[front];
		for(int i=front;i<rear-1;i++){
			arr[i]=arr[i+1];
		}
		rear--;
		size--;
		return element;
	}

	public boolean isFull(){
		return size==arr.length;
	}

	public boolean isEmpty(){
		return size==0;
	}

	public void display(){
		for(int i=front;i<rear;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MyQueue myQueue=new MyQueue(4);
		myQueue.enque(1);
		myQueue.enque(2);
		myQueue.enque(3);
		myQueue.display();
		System.out.println("front element->"+myQueue.dequeue());
		myQueue.display();
		myQueue.enque(4);
		myQueue.enque(5);
		myQueue.display();
		System.out.println("front element->"+myQueue.dequeue());
		System.out.println("front element->"+myQueue.dequeue());
		myQueue.display();



	}

}