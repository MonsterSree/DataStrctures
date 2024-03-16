class Deque{

	/**
	 * Deque disigned with arr,assuming front and rear are in circular way.
	 * 
	 * Time Complexity for below Methods O(1)
	 * insertFront(int val);
	 * deleteFront();
	 * getFront();
	 * insertRear(int val);
	 * deleteRear();
	 * getRear();
	 * isEmpty();
	 * isFull();
	 * */

	int front=0;
	int size=0;
	int capacity;
	int[] arr;

	public Deque(int capacity){
		this.capacity=capacity;
		this.arr=new int[capacity];
	}
	

	public void insertFront(int element){

		if(isFull()){
			return;
		}

		front=(front+capacity-1)%capacity;
		arr[front]=element;
		size++;
	}

	public void deleteFront(){
		if(isEmpty()){
			return;
		}

		front=(front+1)%capacity;
		size--;
	}

	public int getFront(){

		if(isEmpty()){
			return -1;
		}

		return arr[front];

	}

	public void insertRear(int element){

		if(isFull()){
			return;
		}

		int rear=(front+size)%capacity;
		arr[rear]=element;
		size++;
	}

	public void deleteRear(){
		if(isEmpty()){
			return;
		}

		size--;
	}

	public int getRear(){

		if(isEmpty()){
			return -1;
		}

		int currentRear=(front+size-1)%capacity;

		return arr[currentRear];
	}

	public boolean isEmpty(){
		return size==0;
	}

	public boolean isFull(){
		return size==capacity;
	}

	public void display(){
		for(int i=(capacity+front)%capacity;i<capacity;i++){
			System.out.print(arr[i]+"->");
		}
		for(int i=(front+size-1)%capacity;i>=0;i--){
			System.out.print(arr[i]+"->");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Deque deque=new Deque(4);

		System.out.println("isEmpty -> "+deque.isEmpty());
		deque.insertFront(1);
		deque.insertFront(2);
		deque.insertRear(3);
		deque.insertRear(4);

		System.out.println("isFull -> "+deque.isFull());
		deque.display();

		deque.deleteFront();
		deque.deleteRear();
		deque.display();

	}
}