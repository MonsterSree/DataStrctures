import java.util.Arrays;
class MakeMedianX{

	/*
		array has odd numbers of elements
	*/

	public static int minMoves(int[] nums,int X){
		Arrays.sort(nums);
		int midIndex=nums.length/2;
		int midElement=nums[midIndex];
		int moves=0;
		if(midElement<X){
			for(int i=midIndex;i<nums.length && nums[i]<X;i++){
				moves+=X-nums[i];
			}
		}
		else if(midElement>X){
			for(int i=midIndex;i>=0 && nums[i]>X;i--){
				moves+=nums[i]-X;
			}
		}

		return moves;
	}

	public static int minMoves2(int[] nums,int X){
		Arrays.sort(nums);
		int midIndex=nums.length/2;
		int moves=0;
		for(int i=0;i<nums.length;i++){

			if(i<midIndex){
				moves+=Math.max(nums[i]-X,0);
			}
			else if(i>midIndex){
				moves+=Math.max(X-nums[i],0);
			}
			else{
				moves+=Math.abs(X-nums[i]);
			}

		}
		return moves;
	}
	
	public static void main(String[] args) {
		int[] arr={-3,-6,-3,-9,-3};
		int k=-3;
		System.out.println(minMoves(arr,k));
		System.out.println(minMoves2(arr,k));
	}
}