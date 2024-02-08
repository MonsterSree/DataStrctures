import java.util.Stack;

class StackSpanProblem{
	
	public static void printStackSpan(int[] arr){
		Stack<Integer> stack=new Stack<>();
		stack.push(0);
		System.out.println(1);
		for(int i=1;i<arr.length;i++){

			while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
				stack.pop();
			}

			int span=stack.isEmpty()? i+1:i-stack.peek();
			System.out.println(span);
			stack.push(i);
		}
	}

	public static void main(String[] args) {
		int[] arr={30,20,25,28,27,29};
		printStackSpan(arr);
	}
}