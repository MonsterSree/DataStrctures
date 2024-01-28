import java.util.List;
import java.util.ArrayList;
class Leaders{
	public static List<Integer> leadersInArray(int[] arr){
		List<Integer> result=new ArrayList<>();
		int firstLeader=arr[arr.length-1];
		result.add(firstLeader);
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]>firstLeader){
				firstLeader=arr[i];
				result.add(firstLeader);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// int[] arr={7,10,4,3,6,5,2};
		int[] arr={10,20,30};
		List<Integer> result=leadersInArray(arr);
		for(int i=result.size()-1;i>=0;i--){
			System.out.print(result.get(i)+",");
		}
	}

}