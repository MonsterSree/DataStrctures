class MaximumDifference{
	
	public static int maxDifference(int[] arr){
		int max=Integer.MIN_VALUE;
		int maxElement=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--){
			if(maxElement-arr[i]>max){
				max=maxElement-arr[i];
			}
			if(maxElement<arr[i]){
				maxElement=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr={2,3,10,6,4,8,1};
		// int[] arr={7,9,5,6,3,2};
		// int[] arr={10,20,30};
		// int[] arr={30,10,8,2};
		//maximum difference of arr[j]-arr[i] such that j>i
		System.out.println(maxDifference(arr));
	}
}