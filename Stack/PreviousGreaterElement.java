import java.util.Stack;

class PreviousGreaterElement{
	
	public static void prevGreaterElement(int[] arr){
		Stack<Integer> stack=new Stack();
		stack.push(arr[0]);
		System.out.print(-1+",");

		for(int i=1;i<arr.length;i++){
			while(!stack.isEmpty() && stack.peek()<=arr[i]){
				stack.pop();
			}

			int prevGreater=stack.isEmpty() ? -1:stack.peek();

			System.out.print(prevGreater+",");

			stack.push(arr[i]);
		}
	}
	public static void main(String[] args) {
		int[] arr={15,10,18,12,4,6,2,8};
		// int[] arr={15,10,18};

		prevGreaterElement(arr);
	}
}