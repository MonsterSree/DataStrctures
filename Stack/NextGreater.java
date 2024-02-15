import java.util.Stack;

class NextGreater{

	public static int[] nextGreater(int[] arr){

		Stack<Integer> stack=new Stack<>();
		int[] result=new int[arr.length];
		int position=arr.length-1;
		stack.push(arr[position]);
		result[position--]=-1;
		for(int i=arr.length-2;i>=0;i--){

			while(!stack.isEmpty() && stack.peek()<=arr[i]){
				stack.pop();
			}
			int nextGreater=stack.isEmpty() ? -1:stack.peek();
			result[position--]=nextGreater;
			stack.push(arr[i]);
		}

		return result;
	}

	
	public static void main(String[] args) {
		int[] arr={1,3,4,7};
		int[] res=nextGreater(arr);

		for(int element:res){
			System.out.print(element+",");
		}
	}
}