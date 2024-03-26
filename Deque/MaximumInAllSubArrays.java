import java.util.ArrayDeque;
import java.util.List;
import java.util.Deque;
import java.util.ArrayList;

class MaximumInAllSubArrays{
	
	public static List<Integer> getMaximumInAllSubArraysSize(int[] arr,int k){
		Deque<Integer> deque=new ArrayDeque<>();
		List<Integer> result=new ArrayList<>();

		for(int i=0;i<k;i++){
			while(!deque.isEmpty() && arr[deque.getLast()]<=arr[i]){
				deque.removeLast();
			}
			deque.addLast(i);
		}


		result.add(arr[deque.getFirst()]);

		for(int i=k;i<arr.length;i++){
			while(!deque.isEmpty() && deque.getFirst()<=i-k){
				deque.removeFirst();
			}

			while(!deque.isEmpty() && arr[deque.getLast()]<=arr[i]){
				deque.removeLast();
			}

			deque.addLast(i);

			result.add(arr[deque.getFirst()]);
		}

		return result;
	}
	public static void main(String[] args) {
		int[] arr={10,8,5,12,15,7,6};
		int k=3;
		System.out.println("result is -> "+getMaximumInAllSubArraysSize(arr,k));
	}
}