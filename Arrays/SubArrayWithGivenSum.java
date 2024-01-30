class SubArrayWithGivenSum{
	
	public static boolean isSubArrayWithGivenSum(int[] arr, int sum){
		int left=0;
		int right=0;
		int currentSum=0;
		while(right<arr.length){
			
			currentSum=currentSum+arr[right];
			while(sum<currentSum){
				currentSum-=arr[left];
				left++;
			}
			if(currentSum==sum){
				return true;
			}


		}
		return false;
	}

	public static void main(String[] args) {
		// int[] arr={3,2,0,4,7};
		// int[] arr={1,4,20,3,10,5};
		int[] arr={1,4};

		int sum=5;
		System.out.println(isSubArrayWithGivenSum(arr,sum));
	}
}