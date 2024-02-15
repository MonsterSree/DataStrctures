import java.lang.RuntimeException;
class MyStack{
	
	int[] arr;
	int top;
	int capacity;

	public MyStack(int capacity){
		this.arr=new int[capacity];
		this.capacity=capacity;
		this.top=-1;
	}

	public void push(int element){
		if(top==capacity){
			throw new RuntimeException("StackOverflowError");
		}

		arr[++top]=element;
	}

	public int pop(){
		if(top==-1){
			throw new RuntimeException("StackUnderflowError");
		}
		return arr[top--];
	}

	public int peek(){
		if(top==-1){
			throw new RuntimeException("StackUnderflowError");
		}
		return arr[top];
	}

	public void print(){
		for(int i=top;i>=0;i--){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}

	// public void removeElements(int k){
	// 	for(int i=0;i<=top;i++){
	// 		if(arr[i]==k){
	// 			for(int j=i;j<top;j++){
	// 				arr[j]=arr[j+1];
	// 			}
	// 			top--;
	// 		}
	// 	}
	// }

	//second approach
	public void removeElements(int k){
		
	}

	public boolean isEmpty(){
		return top==-1;
	}

	public int size(){
		return top+1;
	}

	public static void main(String[] args){
		MyStack stack=new MyStack(10);
		stack.push(1);
		stack.push(4);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(2);
		stack.push(2);
		stack.print();
		stack.push(5);
		stack.print();
		System.out.println("poped element->"+stack.pop());
		System.out.println("poped element->"+stack.pop());
		stack.print();
		stack.push(4);
		int k=4;
		stack.removeElements(k);
		System.out.println("Removing all "+k+" from stack and size of remaining stack ->"+stack.size());
		stack.print();
		k=2;
		stack.removeElements(k);
		System.out.println("Removing all "+k+" from stack and size of remaining stack ->"+stack.size());
		stack.print();

		

	}
}