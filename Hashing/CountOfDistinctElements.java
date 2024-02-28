import java.util.HashSet;
import java.util.Arrays;

class CountOfDistinctElements{
	
	public static int countOfDistinctElements(Integer[] arr){
		HashSet<Integer> set=new HashSet<>(Arrays.asList(arr));
		// int count=0;
		// for(int i=0;i<arr.length;i++){
		// 	set.add(arr[i]);
		// }
		return set.size();
	}

	public static void main(String[] args) {
		Integer[] arr={15,12,13,12,13,13,18};
		System.out.println(countOfDistinctElements(arr));
	}
}