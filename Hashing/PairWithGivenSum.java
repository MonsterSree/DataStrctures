import java.util.HashSet;
class PairWithGivenSum{
	
	public static boolean isPairExists(int[] arr,int target){
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++){
			if(set.contains(arr[i])){
				return true;
			}
			else{
				set.add(target-arr[i]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr={3,2,8,15,-8};
		int target=20;
		System.out.println(isPairExists(arr,target));
	}
}